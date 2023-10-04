public class Student implements Comparable<Student>{
        int age;
        int height;
        String name;
        String lastName;

        Student(int age, int height, String name, String lastName){
            this.age = age;
            this.height = height;
            this.name = name;
            this.lastName = lastName;
        }

        @Override
        public int compareTo(Student o) {
            System.out.println(this.name.compareTo(o.name));
            if(this.name.compareTo(o.name) != 0){
                return this.name.compareTo(o.name);
            }
            return this.age - o.age;
        }

        @Override
        public String toString()
        {
            //You should populate this string with the data
            //you need inside the TextView
            return this.name + " " + this.age;
        }
    }

