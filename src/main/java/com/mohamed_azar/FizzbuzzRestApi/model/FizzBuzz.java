package com.mohamed_azar.FizzbuzzRestApi.model;

import java.util.ArrayList;

public class FizzBuzz {

    private final int multiple1;

    private final int multiple2;

    private final int limit;

    private final String firstWord;

    private final String secondWord;

    public FizzBuzz(int multiple1, int multiple2, int limit, String firstWord, String secondWord) {
        this.multiple1 = multiple1;
        this.multiple2 = multiple2;
        this.limit = limit;
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    public String getResult() throws Exception
    {
        String errorMessage = this.isNotValid();

        if (errorMessage.isEmpty()) {
            ArrayList<String> result = new ArrayList<>();

            for(int i=1; i<= this.limit;i++) {
                String temp = "";

                if(i % this.multiple1 == 0) {
                    temp += this.firstWord;
                }

                if(i % this.multiple2 == 0) {
                    temp += this.secondWord;
                }
                temp = temp.isEmpty() ? "" + i : temp;
                result.add(temp);
            }

            return result.toString();
        }
        throw new Exception(errorMessage);
    }

    public String isNotValid()
    {
        String errorMessage = "";

        if (this.multiple1 < 0 || this.multiple2 < 0) {
            errorMessage += "provide value for multiple1 and multiple2 as greater than zero\n";
        }

        if (this.limit <= 0) {
            errorMessage += "Limit is lesser or equal to zero\n";
        }

        if (this.firstWord.isEmpty() || this.secondWord.isEmpty()) {
            errorMessage += "provide a string value for firstWord and secondWord\n";
        }

        return errorMessage;
    }
}
