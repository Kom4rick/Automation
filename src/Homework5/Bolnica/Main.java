package Homework5.Bolnica;

public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient();
        patient.setIllCode(3);
        Therapist therapist = new Therapist();
        therapist.appointDoc(patient);
    }
}
