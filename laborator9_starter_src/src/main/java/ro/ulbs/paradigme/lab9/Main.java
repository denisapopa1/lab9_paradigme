package ro.ulbs.paradigme.lab9;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) throws PhoneAppException {
        String file_in = "input_tema.txt";
        String file_out = "output_tema.txt";
        PhoneBook phoneBook = new PhoneBook();
        try {
            phoneBook.readAndSave(file_in, file_out);
        }catch (PhoneAppException ex) {
            ex.printStackTrace();
        }
        phoneBook.print(System.out);
        System.out.println("DONE.");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos, true);
        String s1 = "Maria", s2 = "Popa", s3 = "0771885995", s4 = "acasa";
        List<PhoneEntry> list = List.of(new PhoneEntry(s1, s2, s3, s4));
        PhoneBook pb = new PhoneBook(list);
        //act
        pb.print(ps);

        Writer wr = new OutputStreamWriter(baos);
        pb.save(wr, list);
        try{ wr.flush(); }catch (IOException ignored) {}
        String result = baos.toString();

    }

}