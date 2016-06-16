package com.muks.springeg.DiByConstructor.InjectionByCollections;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by 15692 on 16/06/16.
 */
public class Question {
    private int id;
    private String name;
    private List<String> answers;
    private List<Answer> answerList;
    private Map<String, String> mapAnswers;
    private Map<Answer, User> nonGenMapAnswers;

    public Question() {}
    public Question(int id, String name, List<String> answers) {
        super();
        this.id = id;
        this.name = name;
        this.answers = answers;
    }

    public Question(String name, List<Answer> answers) {
        super();
        this.name = name;
        this.answerList = answers;
    }

    public Question(String name, Map<String, String> answers) {
        super();
        this.name = name;
        this.mapAnswers = answers;
    }


    public Question(int id, String name, Map<Answer, User> answers) {
        super();
        this.id = id;
        this.name = name;
        this.nonGenMapAnswers = answers;
    }

    public void displayInfo(){
        System.out.println(id+" "+name);
        System.out.println("answers are:");
        Iterator<String> itr=answers.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void displayInfoGeneric(){
        System.out.println("answers are:");
        Iterator<Answer> itr = answerList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    public void displayInfoMapAns(){
        System.out.println("\nQuestion id:"+id);
        System.out.println("Question name:"+name);
        System.out.println("Answers....");

        Set<Map.Entry<String, String>> set = mapAnswers.entrySet();
        Iterator<Map.Entry<String, String>> itr=set.iterator();

        while(itr.hasNext()){
            Map.Entry<String,String> entry=itr.next();
            System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
        }
    }

    public void displayInfoNonGenMaps() {
        System.out.println("\n\nQuestion id:"+id);
        System.out.println("question name:"+name);
        System.out.println("Answers....");
        Set<Map.Entry<Answer, User>> set=nonGenMapAnswers.entrySet();
        Iterator<Map.Entry<Answer, User>> itr=set.iterator();
        while(itr.hasNext()){
            Map.Entry<Answer, User> entry=itr.next();
            Answer ans=entry.getKey();
            User user=entry.getValue();
            System.out.println("Answer Information:");
            System.out.println(ans);
            System.out.println("Posted By:");
            System.out.println(user);
        }
    }
}
