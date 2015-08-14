package MidSL;

import MidSL.gen.MidSLBaseVisitor;

/**
 * Created by gzlongyue on 2015/8/13.
 */
// Generated from D:/antlr4/ShaderParser/src/MidSL\MidSL.g4 by ANTLR 4.5.1
import MidSL.gen.MidSLParser;
import MidSL.gen.MidSLVisitor;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * This class provides an empty implementation of {@link MidSLVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * operations with no return type.
 */

public class GLSLVisitor extends MidSLBaseVisitor<String> {
    /**
     * {@inheritDoc}
     *
     boolean isFragment; //true��ʾ��FS�ļ���false��ʾ��VS�ļ�
     Set<String> notInFSfile; //��Ӧ����FS�г��ֵı���������gl-Position
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    final String linebreak = "\r\n";

    String data;  //���ɽ��

    boolean isInmain; //�Ƿ���main��������
    int indentNum;  //��������

    TypeSpecifierCorvertor typeconvertor; //����ת����

    Cbuffer cb;         //Cbuffer�ṹ
    StructVariable inb;  //GLSL�е�in ����
    StructVariable outb; //GLSL�е�out ����

    List<String> prefix;   //����ǰ׺
    Set<String> StructName; //�ṹ����
    Map<String, String> FUNC;   //�����뺯����Ӧ��ϵ
    Map<String, TypeClass> I2T; //���������Ͷ�Ӧ��ϵ��


    //���캯��
    void init(){
        indentNum = 0;
        isInmain = false;

        typeconvertor = new TypeSpecifierCorvertor();

        cb = new Cbuffer();
        inb = new StructVariable();
        outb = new StructVariable();

        prefix = new ArrayList<>();
        StructName = new HashSet<>();
        FUNC = new HashMap<>();
        I2T = new HashMap<>();
    }

    public GLSLVisitor(){
        init();
    }

    public void run(ParseTree tree){
        data = visit(tree);
    }

    public void getFile(String filename) throws IOException {
        try{
            File file =new File(filename);

            //if file doesnt exists, then create it
            if(!file.exists()){
                file.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(file.getName());
            BufferedWriter bw = new BufferedWriter(fileWritter);
            bw.write(data);
            bw.close();

            System.out.println("File Written Done");

        }catch(IOException e) {
            e.printStackTrace();
        }
    }

    public String getString(){
        return data;
    }

    //��������
    void printI2T(String name){
        if(I2T.containsKey(name))
            System.out.println(name + ":" + I2T.get(name).getprefix() + " " + I2T.get(name).gettail());
    }

    void printI2T(){
        for(String name : I2T.keySet())
            printI2T(name);
    }

    //����ǰ������
    String getIndent(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < indentNum; ++i)
            sb.append('\t');
        return sb.toString();
    };

    //������ǰ׺ճ����ȥ
    String AppendPrefix(String tail){
        if(prefix.isEmpty())
            return tail;
        String tmp = "";
        for(String mid : prefix)
            tmp += mid + ".";
        tmp += tail;
        return tmp;
    }

    //�ҵ���tail��β���prefix��������ճ����
    String findLongestPrefix(String tail){
        String ans = tail;
        String pre = "";
        for(String  mid : prefix){
            pre += mid + ".";
            if(I2T.containsKey(pre + tail)){
                ans = pre + tail;
            }
        }
        return ans;
    }

    //�����ڲ�ṹ
    void enterSub(){
        indentNum ++;
    };

    void enterSub(String name){
        if(name != null && !name.isEmpty())
            prefix.add(name);
        indentNum ++;
    };

    //�뿪�ڲ�ṹ
    void exitSub(){
        indentNum --;
    };

    void exitSub(String name){
        if(name != null && !name.isEmpty() && !prefix.isEmpty() && name.equals(prefix.get(prefix.size() - 1 ))){
            prefix.remove(prefix.size()-1);
        }
        indentNum--;
    }

    class TypeClass{
        public String Qualifier, Specifier, Tail; //Tailָ��������

        TypeClass(String q, String s){
            Qualifier = q;
            Specifier = s;
            Tail = "";
        }

        public String getq(){
            return Qualifier;
        }

        public String gets(){
            return Specifier;
        }

        public String getprefix(){
            return Qualifier +  (Qualifier.equals("")? "" : " ") + Specifier;
        }

        public String gettail(){
            return Tail;
        }
    };


    class Cbuffer extends BasicStruc{
        Cbuffer(){ Type = "cbuffer"; }
    };

    class StructVariable extends  BasicStruc{};


    @Override public String visitTest(MidSLParser.TestContext ctx) {    return visitChildren(ctx); }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitProg(MidSLParser.ProgContext ctx) {
        StringBuilder sb = new StringBuilder();
        String htype, gtype, hname, gname;
        TypeClass tc;

        //ץ���궨��
        for(MidSLParser.PreprocessorContext pc : ctx.preprocessor()){
            sb.append(visitPreprocessor(pc));
        }

        //ת��Sample
        for(MidSLParser.Sample_declarationContext smp: ctx.sample_declaration()){
            sb.append(visitSample_declaration(smp) + ";" + linebreak);
        }

        //ת��TEXTURE
        for(MidSLParser.Texture_declarationContext tex: ctx.texture_declaration()){
            visitTexture_declaration(tex);
        }

        //ת��struct
        for(MidSLParser.Struct_declarationContext struct : ctx.struct_declaration()){
            sb.append(linebreak + visitStruct_declaration(struct) + ";" + linebreak);
        }

        //ת��Cbufer
        String cbuffer = visitCbuffer_declaration(ctx.cbuffer_declaration());
        if(!cbuffer.isEmpty())
            sb.append(linebreak + cbuffer + linebreak);

        //ת��inbuffer
        String inbuffer = visitInbuffer_declaration(ctx.inbuffer_declaration());
        if(!cbuffer.isEmpty())
            sb.append(linebreak + inbuffer + linebreak);

        //ת��outbuffer
        String outbuffer = visitOutbuffer_declaration(ctx.outbuffer_declaration());
        if(!cbuffer.isEmpty())
            sb.append(linebreak + outbuffer +  linebreak);

        String statement_list = visitStatement_list(ctx.statement_list());
        if(!statement_list.isEmpty())
            sb.append(linebreak + statement_list);

        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPreprocessor(MidSLParser.PreprocessorContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return "#" + visitVersion_pre(ctx.version_pre()) + linebreak;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVersion_pre(MidSLParser.Version_preContext ctx){
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        String profile = ctx.VERSOIN_PROFILE() != null ? " " + ctx.VERSOIN_PROFILE().getText() :  "";
        return "version " + visitInteger(ctx.integer()) + profile;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_qualifier(MidSLParser.Type_qualifierContext ctx)  {
        if(ctx == null || ctx.isEmpty())
            return "";
        return ctx.getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStorage_qualifier(MidSLParser.Storage_qualifierContext ctx){
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return ctx.getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_modifier(MidSLParser.Type_modifierContext ctx) {
        if(ctx.getText().equals(""))
            return "";
        return ctx.getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInteger(MidSLParser.IntegerContext ctx){
        if(ctx.getText().equals(""))
            return "";
        return ctx.getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFloat_num(MidSLParser.Float_numContext ctx){
        if(ctx.getText().equals(""))
            return "";
        return ctx.getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBool_num(MidSLParser.Bool_numContext ctx) {
        if(ctx.getText().equals(""))
            return "";
        return ctx.getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_specifier(MidSLParser.Type_specifierContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        String noarray = visitType_specifier_nonarray(ctx.type_specifier_nonarray());
        String arraytail = "";
        for(MidSLParser.Array_specifierContext as : ctx.array_specifier())
            arraytail += visitArray_specifier(as);
        return noarray + arraytail;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitType_specifier_nonarray(MidSLParser.Type_specifier_nonarrayContext ctx) {
        if(ctx.getText().equals(""))
            return "";

        if(ctx.basic_type() != null)
            return visitBasic_type(ctx.basic_type());
        return ctx.IDENTIFIER().getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArray_specifier(MidSLParser.Array_specifierContext ctx) {
        return '[' + visitExpression(ctx.expression()) + ']';
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStruct_specifier(MidSLParser.Struct_specifierContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        if(ctx.IDENTIFIER() != null){
            sb.append("." + ctx.IDENTIFIER().getText());
            for(MidSLParser.Array_specifierContext as : ctx.array_specifier()){
                sb.append(visitArray_specifier(as));
            }
        }
        else{
            sb.append("." + visitFunction_call(ctx.function_call()));
        }
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBasic_type(MidSLParser.Basic_typeContext ctx){
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        if(ctx.void_type() != null)
            return visitVoid_type(ctx.void_type());
        else if(ctx.scala_type() != null)
            return visitScala_type(ctx.scala_type());
        else if(ctx.vector_type() != null)
            return visitVector_type(ctx.vector_type());
        else
            return visitMatrix_type(ctx.matrix_type());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVoid_type(MidSLParser.Void_typeContext ctx){
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return typeconvertor.toGLSL(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitScala_type(MidSLParser.Scala_typeContext ctx){
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return typeconvertor.toGLSL(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitVector_type(MidSLParser.Vector_typeContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return typeconvertor.toGLSL(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitMatrix_type(MidSLParser.Matrix_typeContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return typeconvertor.toGLSL(ctx.getText());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression(MidSLParser.ExpressionContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        if(ctx.primary_expression()  != null)
            return visitPrimary_expression(ctx.primary_expression());

        //һԪ�����
        if(ctx.expression().size() == 1){
            if(ctx.INCREAMENT_OP() != null){
                String t = ctx.getText();
                //ǰ������
                if( t.charAt(0) == '+'  || t.charAt(1) == '-')
                    return ctx.INCREAMENT_OP().getText() + visitExpression(ctx.expression(0));
                    //�����Ǻ�������
                else
                    return  visitExpression(ctx.expression(0)) + ctx.INCREAMENT_OP().getText();
            }
            else if(ctx.ADDDIV_OP() != null)
                return ctx.ADDDIV_OP().getText() + visitExpression(ctx.expression(0));
            else
                return ctx.UNARY_OP().getText() + visitExpression(ctx.expression(0));
        }
        //��Ԫ����
        else if(ctx.expression().size() == 2){
            if(ctx.MULDIV_OP() != null)
                return visitExpression(ctx.expression(0)) + " " + ctx.MULDIV_OP().getText() + " " + visitExpression(ctx.expression(1));
            else if(ctx.ADDDIV_OP() != null)
                return visitExpression(ctx.expression(0)) + " " + ctx.ADDDIV_OP().getText() + " " + visitExpression(ctx.expression(1));
            else if(ctx.SHIFT_OP() != null)
                return visitExpression(ctx.expression(0)) + " " + ctx.SHIFT_OP().getText() + " " + visitExpression(ctx.expression(1));
            else if(ctx.COMPARE_OP() != null)
                return visitExpression(ctx.expression(0)) + " " + ctx.COMPARE_OP().getText() + " " + visitExpression(ctx.expression(1));
            else if(ctx.EQUAL_OP() != null)
                return visitExpression(ctx.expression(0)) + " " + ctx.EQUAL_OP().getText() + " " + visitExpression(ctx.expression(1));
            else if(ctx.BITWISE_OP() != null)
                return visitExpression(ctx.expression(0)) + " " + ctx.BITWISE_OP().getText() + " " + visitExpression(ctx.expression(1));
            return visitExpression(ctx.expression(0)) + " " + ctx.LOGIC_OP().getText() + " " + visitExpression(ctx.expression(1));
        }
        //��Ԫ�����
        return visitExpression(ctx.expression(0)) + " ? " + visitExpression(ctx.expression(1)) + " : " + visitExpression(ctx.expression(2));

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitPrimary_expression(MidSLParser.Primary_expressionContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        if(ctx.constant_expression() != null)
            return visitConstant_expression(ctx.constant_expression());
        else if(ctx.basic_type() != null){
            sb.append(visitBasic_type(ctx.basic_type()) + "(");
            for(int i = 0 ; i < ctx.expression().size(); ++i){
                if(i != 0) sb.append(", ");
                sb.append( visitExpression(ctx.expression(i)) );
            }
            sb.append(")");
        }
        else if(ctx.type_specifier() != null){
            sb.append("(");
            sb.append(visitType_specifier(ctx.type_specifier()));
            sb.append(")");
            sb.append(visitExpression(ctx.expression(0)));
        }
        else {
            sb.append( visitLeft_value(ctx.left_value()));
            if(ctx.array_struct_selection() != null)
                sb.append(visitArray_struct_selection(ctx.array_struct_selection()));
        }
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitConstant_expression(MidSLParser.Constant_expressionContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        if(ctx.integer() != null)
            return visitInteger(ctx.integer());
        else if(ctx.float_num() != null)
            return visitFloat_num(ctx.float_num());
        else
            return visitBool_num(ctx.bool_num());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitLeft_value(MidSLParser.Left_valueContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        if(ctx.function_call() != null)
            return visitFunction_call(ctx.function_call());
        else if(ctx.expression() != null)
            return '(' + visitExpression(ctx.expression()) + ")";
        return ctx.IDENTIFIER().getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArray_struct_selection(MidSLParser.Array_struct_selectionContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        String info = ctx.getText();

        int anum = 0, snum = 0;

        int bracket_num = 0;

        for(int i = 0 ; i < info.length(); ++i){
            if(info.charAt(i) == '['){
                bracket_num++;
                if(bracket_num == 1){
                    sb.append(visitArray_specifier(ctx.array_specifier(anum++)));
                }
            }
            else if(info.charAt(i) == ']')
                bracket_num--;
            else if(info.charAt(i) == '.' && bracket_num == 0){
                sb.append(visitStruct_specifier(ctx.struct_specifier(snum++)));
            }
        }

        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAssignment_expression(MidSLParser.Assignment_expressionContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return ctx.ASSIGNMENT_OP().getText() + " " +  visitExpression(ctx.expression());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitArithmetic_assignment_expression(MidSLParser.Arithmetic_assignment_expressionContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return ctx.ARITHMETIC_ASSIGNMENT_OP().getText() + " " + visitExpression(ctx.expression());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_definition(MidSLParser.Function_definitionContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        //���֣����ж��ǲ���ȫ��main����
        String name = visitFunction_name(ctx.function_name());
        if(name.equals("main") && prefix.size() == 0) isInmain = true;

        sb.append(getIndent());

        //��������
        if(isInmain)
            sb.append("void");
        else
            sb.append(visitReturn_Type(ctx.return_Type()));

        sb.append(" " + name);

        //������
        sb.append("(");
        if(!isInmain){
            for(int i = 0 ; i < ctx.func_decl_member().size(); ++i){
                if(i!= 0) sb.append(", ");
                String dec = visitFunc_decl_member(ctx.func_decl_member(i));
                String[] type_id = dec.split(" ");

                TypeClass tc = new TypeClass("", type_id[0]);
                I2T.put(AppendPrefix(type_id[1]), tc);
                sb.append(dec);
            }
        }
        sb.append(") {" + linebreak);

        enterSub(name);
        if(isInmain){ //�����main����������input����
            sb.append(getIndent() + inb.Name + " ");
            sb.append(ctx.func_decl_member(0).IDENTIFIER().getText() + " = ");
            sb.append("get" + inb.Name + "();" + linebreak);
        }
        sb.append(visitStatement_list(ctx.statement_list()));
        exitSub(name);

        sb.append(getIndent() + "}" + linebreak);
        if(name.equals("main")) isInmain = false;
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_declaration(MidSLParser.Function_declarationContext ctx){
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();

        //��������
        sb.append(getIndent() + visitReturn_Type(ctx.return_Type()));

        //����
        String name = visitFunction_name(ctx.function_name());
        sb.append(" " + name);

        //������
        sb.append("(");
        for(int i = 0 ; i < ctx.func_decl_member().size(); ++i){
            if(i!= 0) sb.append(", ");
            String dec = visitFunc_decl_member(ctx.func_decl_member(i));
            sb.append(dec);
        }
        sb.append(") ;" + linebreak);
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_call(MidSLParser.Function_callContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        String name = visitFunction_name(ctx.function_name());

        //�����˷�
        if(name.equals("MATMUL")){
            sb.append("(" + visitExpression(ctx.expression(0)));
            sb.append(" * ");
            sb.append(visitExpression(ctx.expression(1)) + ")");
        }
        else{
            sb.append(name);

            sb.append("(");
            for(int i = 0 ; i < ctx.expression().size(); ++i){
                if(i!= 0) sb.append(", ");
                String dec = visitExpression(ctx.expression(i));
                sb.append(dec);
            }
            sb.append(")");
        }

        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitReturn_Type(MidSLParser.Return_TypeContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return visitType_specifier(ctx.type_specifier());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_name(MidSLParser.Function_nameContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return ctx.getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunc_decl_member(MidSLParser.Func_decl_memberContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return visitType_specifier(ctx.type_specifier()) + " " + ctx.IDENTIFIER().getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStatement_list(MidSLParser.Statement_listContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        for(MidSLParser.StatementContext st: ctx.statement()){
            sb.append(visitStatement(st));
        }
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStatement(MidSLParser.StatementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        if(ctx.simple_statement() != null)
            return visitSimple_statement(ctx.simple_statement());
        else
            return visitCompoud_statement(ctx.compoud_statement());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSimple_statement(MidSLParser.Simple_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        if(ctx.function_definition_statement() != null)
            return visitFunction_definition_statement(ctx.function_definition_statement());
        else if(ctx.basic_statement() != null)
            return getIndent() + visitBasic_statement(ctx.basic_statement()) + ";" + linebreak;
        else if(ctx.selection_statement() != null)
            return visitSelection_statement(ctx.selection_statement());
        else if(ctx.switch_statement() != null)
            return visitSwitch_statement(ctx.switch_statement());
        else if(ctx.case_label() != null)
            return visitCase_label(ctx.case_label());
        else if(ctx.iteration_statement() != null)
            return visitIteration_statement(ctx.iteration_statement());
        else
            return visitJump_statement(ctx.jump_statement());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCompoud_statement(MidSLParser.Compoud_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        return  getIndent() + '{' + linebreak +
                visitStatement_list(ctx.statement_list()) +
                getIndent() + '}' + linebreak;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitBasic_statement(MidSLParser.Basic_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        if(ctx.declaration_statement() != null)
            return visitDeclaration_statement(ctx.declaration_statement());
        else if(ctx.assignment_statement() != null)
            return visitAssignment_statement(ctx.assignment_statement());
        else
            return visitExpression_statement(ctx.expression_statement());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitDeclaration_statement(MidSLParser.Declaration_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";


        if(ctx.struct_declaration() != null)
            return visitStruct_declaration(ctx.struct_declaration());
        else if(ctx.simple_declaration() != null)
            return visitSimple_declaration(ctx.simple_declaration());
        else
            return visitFunction_declaration(ctx.function_declaration());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSimple_declaration(MidSLParser.Simple_declarationContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();


        String qualifier = visitType_qualifier(ctx.type_qualifier());
        String specifier = visitType_specifier(ctx.type_specifier());
        TypeClass   tc = new TypeClass(qualifier, specifier);

        sb.append(qualifier);
        if(!qualifier.isEmpty()) sb.append(" ");
        sb.append(specifier + " ");

        //���������������
        for(int i = 0 ; i < ctx.simple_declarator().size(); ++i){
            //��¼������������Ϣ
            for(MidSLParser.Array_specifierContext as:  ctx.simple_declarator(i).array_specifier())
                tc.Tail += visitArray_specifier(as);

            String name = ctx.simple_declarator(i).left_value().IDENTIFIER().getText();
            String fullname = AppendPrefix(name);

            //��I2T���м�¼������Ϣ
            I2T.put(fullname, tc);

            if(i != 0) sb.append(", ");
            sb.append(visitSimple_declarator(ctx.simple_declarator(i)));
        }
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSimple_declarator(MidSLParser.Simple_declaratorContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        sb.append(visitLeft_value(ctx.left_value()));
        for(MidSLParser.Array_specifierContext as : ctx.array_specifier()){
            sb.append(visitArray_specifier(as));
        }
        if(ctx.semantics() != null){
            sb.append( " : " + visitSemantics(ctx.semantics()));
        }

        if(ctx.assignment_expression() != null)
            sb.append(" " + visitAssignment_expression(ctx.assignment_expression()));
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSemantics(MidSLParser.SemanticsContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return ctx.getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSample_declaration(MidSLParser.Sample_declarationContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        String htype = ctx.IDENTIFIER(0).getText();
        String hname = ctx.IDENTIFIER(2).getText();
        String qualifier = visitType_qualifier(ctx.type_qualifier());
        if(!qualifier.isEmpty()) qualifier +=" ";
        return getIndent() + qualifier + htype + " " + hname;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitTexture_declaration(MidSLParser.Texture_declarationContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        String gname = ctx.IDENTIFIER(0).getText();
        String htype = ctx.IDENTIFIER(1).getText();
        String hname = ctx.IDENTIFIER(2).getText();

        FUNC.put(htype + "." + hname, gname);
        return getIndent() + htype + " " + hname;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitStruct_declaration(MidSLParser.Struct_declarationContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StructVariable strV = new StructVariable();
        strV.Name = ctx.IDENTIFIER().getText();
        TypeClass tc = new TypeClass("", "struct");
        I2T.put(AppendPrefix(strV.Name), tc);

        //��ÿһ����������ת��
        enterSub(strV.Name);
        for(MidSLParser.Simple_declarationContext dec : ctx.simple_declaration()){
            String qualifier = visitType_qualifier(dec.type_qualifier());
            String specifier = visitType_specifier(dec.type_specifier());
            tc = new TypeClass(qualifier, specifier);

            //ͬһ�п��������������
            for(MidSLParser.Simple_declaratorContext dtor : dec.simple_declarator()){
                //��¼������������Ϣ
                for(MidSLParser.Array_specifierContext as:  dtor.array_specifier())
                    tc.Tail += visitArray_specifier(as);

                String hname = dtor.left_value().IDENTIFIER().getText();
                String fullname = AppendPrefix(hname);

                //��I2T���м�¼������Ϣ
                I2T.put(fullname, tc);

                strV.Variable.add(hname); //����������ṹ��
            }
        }
        exitSub(strV.Name);

        return strV.toStruct();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */

    @Override public String visitCbuffer_declaration(MidSLParser.Cbuffer_declarationContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        cb.Name = ctx.IDENTIFIER().getText();
        TypeClass tc = new TypeClass("", "cbuffer");
        I2T.put(AppendPrefix(cb.Name), tc);

        //��ÿһ����������ת��
        enterSub(cb.Name);
        for(MidSLParser.Simple_declarationContext dec : ctx.simple_declaration()){
            String qualifier = visitType_qualifier(dec.type_qualifier());
            String specifier = visitType_specifier(dec.type_specifier());
            tc = new TypeClass(qualifier, specifier);

            //ͬһ�п��������������
            for(MidSLParser.Simple_declaratorContext dtor : dec.simple_declarator()){
                //��¼������������Ϣ
                for(MidSLParser.Array_specifierContext as:  dtor.array_specifier())
                    tc.Tail += visitArray_specifier(as);

                String hname = dtor.left_value().IDENTIFIER().getText();
                String fullname = AppendPrefix(hname);

                //��I2T���м�¼������Ϣ
                I2T.put(fullname, tc);

                cb.Variable.add(hname); //����������ṹ��
            }
        }
        exitSub(cb.Name);

        return cb.toGlobalVariable("uniform");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInbuffer_declaration(MidSLParser.Inbuffer_declarationContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        inb.Name = ctx.IDENTIFIER().getText();
        TypeClass tc = new TypeClass("", "struct");
        I2T.put(AppendPrefix(inb.Name), tc);

        //��ÿһ����������ת��
        enterSub(inb.Name);
        for(MidSLParser.Simple_declarationContext dec : ctx.simple_declaration()){
            String qualifier = visitType_qualifier(dec.type_qualifier());
            String specifier = visitType_specifier(dec.type_specifier());
            tc = new TypeClass(qualifier, specifier);

            //ͬһ�п��������������
            for(MidSLParser.Simple_declaratorContext dtor : dec.simple_declarator()){
                //��¼������������Ϣ
                for(MidSLParser.Array_specifierContext as:  dtor.array_specifier())
                    tc.Tail += visitArray_specifier(as);

                String hname = dtor.left_value().IDENTIFIER().getText();
                String fullname = AppendPrefix(hname);

                //��I2T���м�¼������Ϣ
                I2T.put(fullname, tc);

                inb.Variable.add(hname); //����������ṹ��
            }
        }
        exitSub(inb.Name);

        sb.append(inb.toStruct() + ";" + linebreak);
        sb.append(linebreak);
        sb.append(inb.toGlobalVariable("in"));
        sb.append(linebreak);
        sb.append(inb.toGetFunction());

        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitOutbuffer_declaration(MidSLParser.Outbuffer_declarationContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        outb.Name = ctx.IDENTIFIER().getText();
        TypeClass tc = new TypeClass("", "struct");
        I2T.put(AppendPrefix(outb.Name), tc);

        //��ÿһ����������ת��
        enterSub(outb.Name);
        for(MidSLParser.Simple_declarationContext dec : ctx.simple_declaration()){
            String qualifier = visitType_qualifier(dec.type_qualifier());
            String specifier = visitType_specifier(dec.type_specifier());
            tc = new TypeClass(qualifier, specifier);

            //ͬһ�п��������������
            for(MidSLParser.Simple_declaratorContext dtor : dec.simple_declarator()){
                //��¼������������Ϣ
                for(MidSLParser.Array_specifierContext as:  dtor.array_specifier())
                    tc.Tail += visitArray_specifier(as);

                String hname = dtor.left_value().IDENTIFIER().getText();
                String fullname = AppendPrefix(hname);

                //��I2T���м�¼������Ϣ
                I2T.put(fullname, tc);

                outb.Variable.add(hname); //����������ṹ��
            }
        }
        exitSub(outb.Name);

        sb.append(outb.toStruct() + ";" + linebreak);
        sb.append(linebreak);
        sb.append(outb.toGlobalVariable("out"));
        sb.append(linebreak);
        sb.append(outb.toSetFunction());

        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitInoutbuffer_declaration(MidSLParser.Inoutbuffer_declarationContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return ctx.getText();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFunction_definition_statement(MidSLParser.Function_definition_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return visitFunction_definition(ctx.function_definition());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitAssignment_statement(MidSLParser.Assignment_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();

        sb.append(visitLeft_value(ctx.left_value()));
        sb.append(visitArray_struct_selection(ctx.array_struct_selection()));

        if(ctx.assignment_expression() != null)
            sb.append(" " + visitAssignment_expression(ctx.assignment_expression()));
        else if(ctx.arithmetic_assignment_expression() != null)
            sb.append(" " + visitArithmetic_assignment_expression(ctx.arithmetic_assignment_expression()));
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitExpression_statement(MidSLParser.Expression_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return visitExpression(ctx.expression());
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSelection_statement(MidSLParser.Selection_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        sb.append(getIndent() + "if(" + visitExpression(ctx.expression()) + ")" + linebreak);

        enterSub();
        sb.append(visitSelection_rest_statement(ctx.selection_rest_statement()));
        exitSub();
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSelection_rest_statement(MidSLParser.Selection_rest_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        StringBuilder sb = new StringBuilder();
        sb.append(visitStatement(ctx.statement(0)));

        if(ctx.statement().size() > 1){
            exitSub();
            sb.append(getIndent() + "else" + linebreak);
            exitSub();
            sb.append(visitStatement(ctx.statement(1)));
        }
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitSwitch_statement(MidSLParser.Switch_statementContext ctx){
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        sb.append(getIndent() + "switch(" + visitExpression(ctx.expression()) + "){" + linebreak);
        enterSub();
        sb.append(visitStatement_list(ctx.statement_list()));
        exitSub();
        sb.append("}");
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitCase_label(MidSLParser.Case_labelContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        if(ctx.expression() != null)
            return getIndent() + "case " + visitExpression(ctx.expression()) + " :" + linebreak;
        else
            return getIndent() + "defualt : " + linebreak;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitIteration_statement(MidSLParser.Iteration_statementContext ctx){
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();
        if(ctx.WHILE() != null){
            if(ctx.DO() == null){  //whileѭ��
                sb.append(getIndent() + "while(" + visitExpression(ctx.expression()) + ")" + linebreak);
                enterSub();
                sb.append(visitStatement(ctx.statement()));
                exitSub();
            }
            else{                   //do-whileѭ��
                sb.append(getIndent() + "do" + linebreak);
                enterSub();
                sb.append(visitStatement(ctx.statement()));
                exitSub();
                sb.append(getIndent() + "while(" + visitExpression(ctx.expression()) + ");" + linebreak);
            }
        }
        else{
            sb.append(getIndent() + "for(");
            sb.append(visitFor_init_statement(ctx.for_init_statement()));
            sb.append(visitFor_cond_statement(ctx.for_cond_statement()));
            sb.append(visitFor_rest_statement(ctx.for_rest_statement()));
            sb.append(")");
        }
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFor_init_statement(MidSLParser.For_init_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < ctx.basic_statement().size(); ++i){
            if(i != 0) sb.append(", ");
            sb.append(visitBasic_statement(ctx.basic_statement(i)));
        }
        sb.append(";");
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFor_cond_statement(MidSLParser.For_cond_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";
        return visitExpression(ctx.expression()) + ";";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitFor_rest_statement(MidSLParser.For_rest_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < ctx.basic_statement().size(); ++i){
            if(i != 0) sb.append(", ");
            sb.append(visitBasic_statement(ctx.basic_statement(i)));
        }
        return sb.toString();
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override public String visitJump_statement(MidSLParser.Jump_statementContext ctx) {
        if(ctx == null || ctx.getText().isEmpty())
            return "";

        if(ctx.CONTINUE() != null)
            return getIndent() + "continue ;" + linebreak;
        else if(ctx.BREAK() != null)
            return getIndent() + "break ;" + linebreak;
        else {
            if(ctx.expression() == null)
                return getIndent() + "return ;" + linebreak;
            else{
                //��main������
                if(isInmain){
                    return getIndent() + "set" + outb.Name + "(" + visitExpression(ctx.expression())+");" + linebreak;
                }
                else
                    return getIndent() + "return " + visitExpression(ctx.expression()) + " ;" + linebreak;
            }
        }

    }




    //�����ľۺ�����
    class BasicStruc{
        public  String Name = "";
        public  String Type = "struct";
        public  List<String> Variable = new ArrayList<>();

        //���ؽṹ�ַ���
        public String toStruct(){
            StringBuilder sb = new StringBuilder();

            sb.append(getIndent() + Type + " " + Name + '{' + linebreak);

            enterSub(Name);
            for(String name : Variable){
                String fullname = AppendPrefix(name);
                if(I2T.containsKey(fullname)){
                    sb.append(getIndent());
                    sb.append(I2T.get(fullname).getprefix());
                    sb.append(" " + name);
                    sb.append(I2T.get(fullname).gettail());


                    sb.append(";" + linebreak);
                }
            }
            exitSub(Name);

            sb.append(getIndent() + '}');

            return sb.toString();
        };

        //����ȫ�ֱ���
        public String toGlobalVariable(String qualifer){
            StringBuilder sb = new StringBuilder();

            enterSub(Name);
            exitSub();
            for(String name : Variable){
                String fullname = AppendPrefix(name);
                //System.out.println("****" + fullname);
                if(I2T.containsKey(fullname)){
                    //.out.println("****" + fullname);
                    sb.append(getIndent());
                    if(!qualifer.isEmpty())
                        sb.append(qualifer + " ");
                    sb.append(I2T.get(fullname).getprefix());
                    sb.append(" " + name);
                    sb.append(I2T.get(fullname).gettail());
                    sb.append(";" + linebreak);
                }
            }
            exitSub(Name);
            enterSub();

            return sb.toString();
        };

        //����getInput����
        public String toGetFunction(){
            StringBuilder sb = new StringBuilder();
            String paraname = "tmp";

            sb.append(getIndent() + Name + " get" + Name + "()" + linebreak);
            sb.append(getIndent() + "{" + linebreak);

            enterSub(Name);
            sb.append(getIndent() + Name + " " + paraname + ";" + linebreak);
            for(String name : Variable){
                sb.append(getIndent());
                sb.append(paraname + "." + name + " = " + name + ";" + linebreak);
            }
            sb.append(getIndent() + "return " + paraname + ";" + linebreak);
            exitSub(Name);

            sb.append(getIndent() + "}" + linebreak);
            return sb.toString();
        };

        //����setOutput����
        public String toSetFunction(){
            StringBuilder sb = new StringBuilder();
            String paraname = "tmp";

            sb.append(getIndent() + "void set" + Name + "(" + Name + " " + paraname + ")" + linebreak);
            sb.append(getIndent() + "{" + linebreak);

            enterSub(Name);
            for(String name : Variable){
                sb.append(getIndent());
                sb.append( name + " = " + paraname + "." + name + ";" + linebreak);
            }
            exitSub(Name);

            sb.append(getIndent() + "}" + linebreak);
            return sb.toString();
        };
    };
}