public class Main {
    public static void main(String[] args) {
        ScientificBook s1 = new ScientificBook("s1","dfg",250,36,"PubS");
        ScientificBook s2 = new ScientificBook("s2","ttt",333,300,"s2Pub");
        ScientificBook s3 = new ScientificBook("s3","kkk",222,4000,"s3Pub");
        LiteratureBook l1 = new LiteratureBook("l1","ppp",360,"l1Author",2013);
        LiteratureBook l2 = new LiteratureBook("l2","sss",470,"l2Author",2015);
        LiteratureBook l3 = new LiteratureBook("l3","ooo",259,"l3Author",2016);
        Library library = new Library.BuildLibrary()
                .withName("Farab")
                        .withCountry("Kazakhstan")
                                .withCity("Turkistan").build();
        library.addBook(s1);
        library.addBook(s2);
        library.addBook(s3);
        library.addBook(l1);
        library.addBook(l2);
        library.addBook(l3);
        library.printLibraryData();


    }
}