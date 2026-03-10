    class Main {
        static class Learner {
            String name;
            int xp;

            Learner(){
                this.name = "unknown";
                this.xp = 0;
                System.out.println("No-argument constrcutor");
            }

            Learner(String name,int xp){
                this.name = name;
                this.xp = xp;
                System.out.println("argument constrcutor");
            }

            Learner(Learner other){
                this.name = other.name;
                this.xp = other.xp;
                System.out.println("copy constrcutor");
            }

            void display() { System.out.println("Learner: "+name + " " + "xp: " + xp);}
        }
        public static void main(String[] args){
            Learner l = new Learner();
            // l.display();

            Learner l2 = new Learner("Saurabh",100);
            

            Learner l3 = new Learner(l2);
            l3.display();
            l2.name = "l2-rahul";
            l2.display();
        }
    }