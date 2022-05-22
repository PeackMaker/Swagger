package com.macbookpro.springswagger.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import springfox.documentation.builders.*;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc:
 * @Author: PEACEMAKER
 * @Date: 2022/5/22
 */
@Configuration
@EnableKnife4j
@EnableOpenApi
public class Swagger3Config {
    @Bean
    public Docket createRestApi() {
        //    返回文档概要信息
        return new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(Operation.class))
                .paths(PathSelectors.any())
                .build()
                .globalRequestParameters(getGlobalRequestParameters())
                .globalResponses(HttpMethod.GET,getGlobalResponseMessage())
                .globalResponses(HttpMethod.POST,getGlobalResponseMessage());
    }

    /**
     * 生成接口信息,包括标题,联系人等
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("小斌斌的接口文档")
                .description("如有疑问,请联系小斌斌")
                .contact(new Contact("斌斌", "http://www.baidu.com", "binbin@qq.com"))
                .version("1.0")
                .build();
    }

    /**
     * 封装全局通用参数
     * @return
     */
    private List<RequestParameter> getGlobalRequestParameters() {
        List<RequestParameter> parameters = new ArrayList<>();
        parameters.add(new RequestParameterBuilder()
                .name("uuid")
                .description("设备的uuid")
                .required(true)
                .in(ParameterType.QUERY)
                .query(q->q.model(m->m.scalarModel(ScalarType.STRING)))
                .required(false)
                .build());
        return parameters;
    }

    private List<Response> getGlobalResponseMessage(){
        List<Response> responseList=new ArrayList<>();
        responseList.add(new ResponseBuilder().code("404").description("未找到资源").build());
        return responseList;
    }
}
