package com.in28minues.spring.basics.springin5steps.basic;

import org.springframework.stereotype.Component;

@Component
//@Primary
//@Qualifier("quick")
public class QuickSortAlgorithm  implements SortAlgorithm{
    public int[] sort(int arr[]){
        return arr;
    }
}
