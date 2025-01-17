package com.hotels.web.movie.config;

import static org.apache.commons.lang3.StringUtils.SPACE;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.hotels.beans.BeanUtils;
import com.hotels.beans.model.FieldMapping;
import com.hotels.beans.model.FieldTransformer;
import com.hotels.beans.transformer.Transformer;


@Configuration
public class MovieTransformerConfig {
    @Bean
    public Transformer movieResponseTransformer(final BeanUtils beanUtils) {
        return beanUtils.getTransformer()
                .setFlatFieldNameTransformation(true)
                .withFieldMapping(new FieldMapping("fullName", "name"))
                .withFieldMapping(new FieldMapping("fullName", "surname"))
                .withFieldTransformer(new FieldTransformer<String, String>("name", fullName -> fullName.split(SPACE)[0]))
                .withFieldTransformer(new FieldTransformer<String, String>("surname", fullName -> fullName.split(SPACE)[1]));
    }
}
