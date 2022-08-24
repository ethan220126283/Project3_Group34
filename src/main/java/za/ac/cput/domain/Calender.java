package za.ac.cput.domain;

public class Calender {

    private int classroom_id;

    private int calender_Id;

    private int calender_date;

    private String calender_name;

    private String  calender_description;


    private Calender(){

    }
    private static class Builder{
        private int calender_Id;
        private int classroom_Id;
        private int calender_date;
        private String calender_name;
        private String calender_description;


        public Builder(){

        }

        public Builder setCalender_Id(int calender_Id) {
            this.calender_Id = calender_Id;
            return this;
        }

        public Builder setClassroom_Id(int classroom_Id) {
            this.classroom_Id = classroom_Id;
            return this;
        }

        public Builder setCalender_date(int calender_date) {
            this.calender_date = calender_date;
            return this;
        }

        public Builder setCalender_name(String calender_name) {
            this.calender_name = calender_name;
            return this;
        }


        public Builder setCalender_description(String calender_description) {
            this.calender_description = calender_description;
            return this;
        }

        public Calender build() {

            Calender calender = new Calender();
            calender.calender_Id = this.calender_Id;
            calender.classroom_id = this.classroom_Id;
            calender.calender_date = this.calender_date;
            calender.calender_name = this.calender_name;
            calender.calender_description = this.calender_description;
            return calender;
        }

        }


    public int getClassroom_id() {
        return classroom_id;
    }

    public int getCalender_Id() {
        return calender_Id;
    }

    public int getCalender_date() {
        return calender_date;
    }

    public String getCalender_name() {
        return calender_name;
    }

    public String getCalender_description() {
        return calender_description;
    }

    @Override
    public String toString() {
        return "Calender{" +
                "classroom_id=" + classroom_id +
                ", calender_Id=" + calender_Id +
                ", calender_date=" + calender_date +
                ", calender_name='" + calender_name + '\'' +
                ", calender_description='" + calender_description + '\'' +
                '}';
    }
}


