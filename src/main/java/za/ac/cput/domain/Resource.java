package za.ac.cput.domain;

/*
 * Author:       Ethan Swart
 * Student#:     220126283
 * Last Edited:  2022/08/25
 */


import java.util.Objects;

public class Resource {

    //Attributes for Resource
    private int classroom_id;
    private int resource_id;
    private String resource_date;
    private String resource_type;
    private String resource_link;
    private String resource_description;

    private Resource() {}

    public static class Builder {

        //Builder attributes
        private int classroom_id;
        private int resource_id;
        private String resource_date;
        private String resource_type;
        private String resource_link;
        private String resource_description;

        //Builder constructor
        public Builder() {}

        //Builder returns
        public Builder theirClassroom_Id(int classroom_id) {
            this.classroom_id = classroom_id;
            return this;
        }

        public Builder theirResource_Id(int resource_id) {
            this.resource_id = resource_id;
            return this;
        }

        public Builder theirResource_Date(String resource_date) {
            this.resource_date = resource_date;
            return this;
        }

        public Builder theirResource_Type(String resource_type) {
            this.resource_type = resource_type;
            return this;
        }

        public Builder theirResource_Link(String resource_link) {
            this.resource_link = resource_link;
            return this;
        }

        public Builder theirResource_Description(String resource_description) {
            this.resource_description = resource_description;
            return this;
        }

        //Build method
        public Resource build() {
            Resource resource = new Resource();
            resource.classroom_id = this.classroom_id;
            resource.resource_id = this.resource_id;
            resource.resource_date = this.resource_date;
            resource.resource_type = this.resource_type;
            resource.resource_link = this.resource_link;
            resource.resource_description = this.resource_description;
            return resource;
        }
    }

    //Getters
    public int getClassroom_id() {return classroom_id;}

    public int getResource_id() {return resource_id;}

    public String getResource_date() {return resource_date;}

    public String getResource_type() {return resource_type;}

    public String getResource_link() {return resource_link;}

    public String getResource_description() {return resource_description;}

    //toString method
    @Override
    public String toString() {
        return "Resource{" +
                "classroom_id=" + classroom_id +
                ", resource_id=" + resource_id +
                ", resource_date='" + resource_date + '\'' +
                ", resource_type='" + resource_type + '\'' +
                ", resource_link='" + resource_link + '\'' +
                ", resource_description='" + resource_description + '\'' +
                '}';
    }

    //equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resource resource = (Resource) o;
        return classroom_id == resource.classroom_id && resource_id == resource.resource_id && Objects.equals(resource_date, resource.resource_date) && Objects.equals(resource_type, resource.resource_type) && Objects.equals(resource_link, resource.resource_link) && Objects.equals(resource_description, resource.resource_description);
    }

    //hashCode method
    @Override
    public int hashCode() {
        return Objects.hash(classroom_id, resource_id, resource_date, resource_type, resource_link, resource_description);
    }

}
