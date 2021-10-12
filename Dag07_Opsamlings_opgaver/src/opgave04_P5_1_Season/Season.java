package opgave04_P5_1_Season;

public class Season {
    private int day;
    private int month;

    public Season(int day,int month){
        this.day = day;
        this.month = month;
    }

    public String foreSprøgOmSeason(){
        //metode, bestemmer seasonen//
        String result = "";
            if (this.month == 1 || this.month == 2 || this.month == 3){
                result = "Winter";
            }else if (this.month == 4 || this.month == 5 || this.month == 6){
                result = "Spring";
            }else if (this.month == 7 || this.month == 8 || this.month == 9) {
                result = "Summer";
            }else if (this.month == 10 || this.month == 11 || this.month == 12){
                result = "Fall";
            }
            if (this.month % 3 == 0 && this.day >=21){
                if (result == "Winter"){
                    result = "Spring";
                }else if (result == "Spring"){
                    result = "Summer";
                }else if (result == "Summer"){
                    result = "Fall";
                }else{
                    result = "Winter";
                }
            }

            return result;
    }


    //Ny metode//
    }

