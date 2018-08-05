public class Reformatory {
    private int noof;

    public int weight(Person person) {
        // return the weight of the person
        this.noof++;
        return person.getWeight();
        
    }

    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }
    
    public int totalWeightsMeasured() {
        return noof;
    }

}
