package com.in28minues.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
    @Autowired
    SortAlgorithm sortAlgorithm;

//    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construction of BinarySearchImpl Bean");
    }
    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        this.sortAlgorithm = sortAlgorithm;
    }


    public SortAlgorithm getSortAlgorithm() {
        return sortAlgorithm  ;
    }
    public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int arr[], int target){
        return 3;
    }

//    @PreDestroy
    public void preDestroy(){
        System.out.println("Pre Destruction of BinarySearchImpl Bean");
    }
}
