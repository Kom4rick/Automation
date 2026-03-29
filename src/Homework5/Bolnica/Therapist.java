package Homework5.Bolnica;

public class Therapist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Therapist gladit po golovke");
    }

    public void appointDoc(Patient patient){
        int code = patient.getIllCode();
        if (code == 1){
            patient.setDoctor(new Surgeon());
            patient.getDoctor().heal();
        } else if (code == 2){
            patient.setDoctor(new Dentist());
            patient.getDoctor().heal();
        } else {
            patient.setDoctor(new Therapist());
            patient.getDoctor().heal();
        }
    }
}
