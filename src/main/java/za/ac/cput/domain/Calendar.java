package za.ac.cput.domain;

public class Calendar {

    private int classroom_id;

    private int calendar_Id;

    private int calendar_date;

    private String calendar_name;

    private String  calendar_description;


    private Calendar(){

    }
    private static class Builder{
        private int calendar_Id;
        private int classroom_Id;
        private int calendar_date;
        private String calendar_name;
        private String calendar_description;


        public Builder(){

        }

        public Builder setCalendar_Id(int calendar_Id) {
            this.calendar_Id = calendar_Id;
            return this;
        }

        public Builder setClassroom_Id(int classroom_Id) {
            this.classroom_Id = classroom_Id;
            return this;
        }

        public Builder setCalendar_date(int calendar_date) {
            this.calendar_date = calendar_date;
            return this;
        }

        public Builder setCalendar_name(String calendar_name) {
            this.calendar_name = calendar_name;
            return this;
        }


        public Builder setCalendar_description(String calendar_description) {
            this.calendar_description = calendar_description;
            return this;
        }

        public Calendar build() {

            Calendar calendar = new Calendar();
            calendar.calendar_Id = this.calendar_Id;
            calendar.classroom_id = this.classroom_Id;
            calendar.calendar_date = this.calendar_date;
            calendar.calendar_name = this.calendar_name;
            calendar.calendar_description = this.calendar_description;
            return calendar;
        }

        }


    public int getClassroom_id() {
        return classroom_id;
    }

    public int getCalendar_Id() {
        return calendar_Id;
    }

    public int getCalendar_date() {
        return calendar_date;
    }

    public String getCalendar_name() {
        return calendar_name;
    }

    public String getCalendar_description() {
        return calendar_description;
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "classroom_id=" + classroom_id +
                ", calendar_Id=" + calendar_Id +
                ", calendar_date=" + calendar_date +
                ", calendar_name='" + calendar_name + '\'' +
                ", calendar_description='" + calendar_description + '\'' +
                '}';
    }
}


