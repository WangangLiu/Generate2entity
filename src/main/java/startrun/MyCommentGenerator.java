package startrun;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;
import org.mybatis.generator.internal.DefaultCommentGenerator;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import static org.mybatis.generator.internal.util.StringUtility.isTrue;

public class MyCommentGenerator extends DefaultCommentGenerator {
    @Override
    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
// 添加字段注释
        StringBuffer sb = new StringBuffer();
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * <pre>");
        if (introspectedColumn.getRemarks() != null)
            field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
        sb.append(" * 表字段 : ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        sb.append('.');
        sb.append(introspectedColumn.getActualColumnName());
        field.addJavaDocLine(sb.toString());
        field.addJavaDocLine(" * </pre>");
        field.addJavaDocLine(" * ");
// addJavadocTag(field, false);
        field.addJavaDocLine(" */");
    }
}
