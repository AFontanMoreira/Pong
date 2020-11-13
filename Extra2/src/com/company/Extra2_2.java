package com.company;

public class Extra2_2 {
    public boolean Ej2(int dia,int mes,int año){
        boolean validoDia=false,validoAño=false;
        if (mes >= 1 && mes <= 12){
            switch (mes){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    if (dia >=1 && dia <= 31){
                        validoDia=true;
                    }
                    break;
                case 4: case 6: case 9: case 11:
                        if (dia >=1 && dia <= 30){
                            validoDia=true;
                        }
                        break;
                case 2:
                    if ((año%4 == 0) && (año%100!= 0) || (año%400 == 0)){
                        if (dia >=1 && dia <= 29){
                            validoDia=true;
                        }
                    }else if (dia >=1 && dia <= 28){
                        validoDia=true;
                    }
                    break;
            }
        }
        if (año >=1600 && año <= 3000){
            validoAño=true;
        }
        if (validoAño == true && validoDia == true){
            return true;
        }else return false;
    }
}
