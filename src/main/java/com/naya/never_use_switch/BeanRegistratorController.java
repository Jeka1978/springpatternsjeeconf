package com.naya.never_use_switch;

import com.naya.never_use_switch.reflections.BeanMD;
import com.naya.never_use_switch.reflections.CCL;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_SINGLETON;

/**
 * @author Evgeny Borisov
 */
@RestController
public class BeanRegistratorController {

    @Autowired
    private GenericApplicationContext context;

    @Autowired
    private CCL ccl;

    @PostMapping("/regbean")
    @SneakyThrows
    public String registerNewSingleton(@RequestBody BeanMD beanMD){
        Class loadedClass = ccl.findClass(beanMD.getBeanClassName());
        var registry = (BeanDefinitionRegistry) context.getBeanFactory();
        GenericBeanDefinition myBeanDefinition = new GenericBeanDefinition();
        myBeanDefinition.setBeanClass(loadedClass);
        myBeanDefinition.setScope(SCOPE_SINGLETON);
        registry.registerBeanDefinition(beanMD.getBeanName(), myBeanDefinition);
        context.getBean(beanMD.getBeanName());
        return "registered";
    }






}
