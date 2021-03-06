package lt.vtvpmc.ems.Collections_demo;

import java.util.HashSet;
import java.util.Set;

/**
 * Hello world!
 *
 */
public class AppEliphant01Sets
{
    private static class Eliphant {
        private String name;
        private double weight;

        public Eliphant(String name, double weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return this.name;
        }

        public double getWeight() {
            return this.weight;
        }

        @Override   //autogenerated
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((name == null) ? 0 : name.hashCode());
            return result;
        }

        @Override   //autogenerated
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Eliphant other = (Eliphant) obj;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }

    }

    public static void main(String[] args)
    {
        Set<Eliphant> eliphants = new HashSet<Eliphant>();

        eliphants.add(new Eliphant("Jonas", 900));
        eliphants.add(new Eliphant("Onute", 700));

//      System.out.println(
//          (new Eliphant("Jonas", 900)).equals(new Eliphant("Jonas", 800))
//      );

        System.out.println(
                eliphants.contains(new Eliphant("Jonas", 800))
        );
    }
}
