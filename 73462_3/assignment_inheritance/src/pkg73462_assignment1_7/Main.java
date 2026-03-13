package pkg73462_assignment1_7;
//73462
public class Main {
    public static void main(String[] args){
        Doctor doc = new Doctor();
        Nurse nur = new Nurse();
        Patient pat = new Patient();

        doc.pay = 2000000;
        nur.pay = 1500000;

        pat.diagnosis = doc.diagnose();
        pat.prescriptions = doc.prescribe();

        nur.treatement();

        System.out.println("Diagnosis: " + pat.diagnosis);
        System.out.println("Prescription: " + pat.prescriptions);
    }
}
