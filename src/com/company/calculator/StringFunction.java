package com.company.calculator;

public enum StringFunction {

    TO_UPPER_FUNCTION {
        public String appy(String input){
            return input.toUpperCase();

        }
    },
    TO_LOWER_FUNCTION {
        @Override
        public String appy(String input) {
            return input.toLowerCase();
        }
    },

    REMOVE_CHAR_FUNCTION {
        @Override
        public String aappy(String input) {
            final String EMPTY="";
            return input.replace(char)

        }
    }
    public abstract String aapy(String);
}
