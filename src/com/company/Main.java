package com.company;

import java.util.Arrays;

public class Main {
    private static String inputMessage = "Еъёчхф Вхзёюлх, адздёиу ф ждэщхб, црбх еёдюэчъщъгюъв южаижжзчх, ждчъёнъгжзчдв. Ъы зёюивй жёхчгюв бюнс ж ъы вдгивъгзхбсгрв аёхкдв. Зъеъёс вгъ дмъчющгд, мзд гъюэцъьгджзс тздшд аёхкх фчбфъзжф жбъщжзчюъв гъждчъёнъгжзчх мъбдчъмъжадшд югщючющиивх. Ф юэимюб чхни южздёюу ю чгыж юэвъгъгюф, здмгъъ дзёхэюч еджздфггиу юэвъгмючджзс мъбдчъмъжаюк едёдадч. Ю зъв гъ въгъъ, еджбъщдчхбх гъищхмх. Ф еёюнъб а чрчдщи, мзд чюгдя чжъви вдя югзъббъаз, х чдэвдьгд, вды мёъэвъёгдъ жзёъвбъгюъ ад чжъви шхёвдгюмгдви. Гхязю ёънъгюъ вгъ едвдшбх еёдшёхввх югзиюзючгдшд зюех, жеълюхбсгд ждэщхггхф щбф юэимъгюф деёъщъбъггрк жздёдг мъбдчъмъжадя щиню. Въгф вдьгд гхэчхзс дзлдв Вхзёюлр, х ъы, цъэ еёъичъбюмъгюф, вхзъёсу.";

    private static char singleLetterShift(char inputLetter) {
        if ((inputLetter >= 1040 && inputLetter <= 1103) || (1025 == inputLetter) || (1105 == inputLetter)) {
            int inputLetterCode = inputLetter;
            if (!Arrays.asList(1045, 1025, 1071, 1077, 1105, 1103).contains(inputLetterCode)) {
                return (char) ((int) inputLetter + 1);
            } else {
                switch (inputLetterCode) {
                    case 1045: // letter "Е"
                        inputLetterCode = 1025; //letter "Ё"
                        break;
                    case 1025: //letter "Ё"
                        inputLetterCode = 1046; //letter "Ж"
                        break;
                    case 1071: //letter "Я"
                        inputLetterCode = 1040; //letter "А"
                        break;
                    case 1077: //letter "е"
                        inputLetterCode = 1105; //letter "ё"
                        break;
                    case 1105: //letter "ё"
                        inputLetterCode = 1078; //letter "ж"
                        break;
                    case 1103: //letter "z"
                        inputLetterCode = 1072; //letter "а"
                        break;
                }
                return (char) inputLetterCode;
            }
        }
        return inputLetter;
    }

    public static void main(String[] args) {
        int inputTextLength = inputMessage.length();
        char[] inputMessageArray = inputMessage.toCharArray();
        char[] outputMessageArray = new char[inputTextLength];
        String outputMessage;

        for (int i = 0; i < 32; i++) { //for all unique letter in RU alphabet
            for (int j = 0; j < inputTextLength; j++) { //for inputMessage length
                outputMessageArray[j] = singleLetterShift(inputMessageArray[j]);
            }
            System.out.println(outputMessageArray);
            outputMessage = Arrays.toString(outputMessageArray);
            inputMessage = outputMessage;
            inputMessageArray = outputMessageArray;
        }
    }
}