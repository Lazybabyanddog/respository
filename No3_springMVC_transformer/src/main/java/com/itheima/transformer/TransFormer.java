package com.itheima.transformer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransFormer implements Converter<String,Date> {


    @Override
    public Date convert(String s) {
            try {
                if (StringUtils.isEmpty(s)){
                throw new Exception("请输入要转换的参数");}
                DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                Date date = df.parse(s);
                return date;
            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
    }
}
