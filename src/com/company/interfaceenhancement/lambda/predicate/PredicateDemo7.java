package com.company.interfaceenhancement.lambda.predicate;

public class PredicateDemo7  implements Predicate7<Integer>{

    @Override
    public boolean test(Integer age) {
        if (age > 18) {
            return  true;
        }
        else {
            return false;
        }
    }
}
