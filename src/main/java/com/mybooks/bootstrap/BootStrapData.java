package com.mybooks.bootstrap;

import com.mybooks.models.Author;
import com.mybooks.models.Book;
import com.mybooks.models.Publisher;
import com.mybooks.repositories.AuthorRepository;
import com.mybooks.repositories.BookRepository;
import com.mybooks.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher rson = new Publisher("R Sons Books", "Ho. No. 1658, Gali No. 18, Nathu Colony", "Nathupura", "New Delhi", "110084");
        publisherRepository.save(rson);

        Author paulo = new Author("Paulo Coelho");
        Book alchemist = new Book("The Alchemist", "12345", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-1.jpg", rson);
        alchemist.setDescription("The Alchemist is a classic novel in which a boy named Santiago embarks on a journey seeking treasure " +
                "in the Egyptian pyramids after having a recurring dream about it and on the way meets mentors, falls in love, and most importantly, " +
                "learns the true importance of who he is and how to improve himself and focus on what really matters in life.");
        Set<Author> authors = new HashSet<>();
        authors.add(paulo);
        alchemist.setAuthors(authors);
        authorRepository.save(paulo);
        bookRepository.save(alchemist);

        Author jamesClear = new Author("James Clear");
        Book atomicHabits = new Book("Atomic Habits", "12346", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-2.jpg", rson);
        atomicHabits.setDescription("Atomic Habits is the definitive guide to breaking bad behaviors and adopting good ones in four steps, " +
                "showing you how small, incremental, everyday routines compound into massive, positive change over time.");
        Set<Author> authors1 = new HashSet<>();
        authors1.add(jamesClear);
        atomicHabits.setAuthors(authors1);
        authorRepository.save(jamesClear);
        bookRepository.save(atomicHabits);

        Author danielKahneman = new Author("Daniel Kahneman");
        Book thinkingFastAndSlow = new Book("Thinking Fast and Slow", "12347", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-3.jpg", rson);
        thinkingFastAndSlow.setDescription("Thinking Fast and Slow shows you how two systems in your brain are constantly fighting over control" +
                " of your behavior and actions, and teaches you " +
                "the many ways in which this leads to errors in memory, judgment and decisions, and what you can do about it.");
        Set<Author> authors2 = new HashSet<>();
        authors2.add(danielKahneman);
        thinkingFastAndSlow.setAuthors(authors2);
        authorRepository.save(danielKahneman);
        bookRepository.save(thinkingFastAndSlow);

        Author donMiguelRuiz = new Author("Don Miguel Ruiz");
        Book theFourAgreements = new Book("The Four Agreements", "12348", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-4.jpg", rson);
        theFourAgreements.setDescription("The Four Agreements draws on the long tradition of the Toltecs, an ancient, indigenous people of Mexico, to show you that we have been domesticated from childhood, how these internal, guiding rules hurt us and what we can do to break and replace them with a new set of agreements with ourselves.");
        Set<Author> authors3 = new HashSet<>();
        authors3.add(donMiguelRuiz);
        theFourAgreements.setAuthors(authors3);
        authorRepository.save(donMiguelRuiz);
        bookRepository.save(theFourAgreements);

        Author stephenRCovey = new Author("Stephen R. Covey");
        Book theHabits= new Book("The 7 Habits Of Highly Effective People", "12349", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-5.jpg", rson);
        theHabits.setDescription("The 7 Habits Of Highly Effective People teaches you both personal and professional effectiveness by changing your view of how the world works and giving you 7 habits, which, if adopted well, will lead you to immense success.");
        Set<Author> authors4 = new HashSet<>();
        authors4.add(stephenRCovey);
        theHabits.setAuthors(authors4);
        authorRepository.save(stephenRCovey);
        bookRepository.save(theHabits);

        Author mikeBayer = new Author("Mike Bayer");
        Book bestSelf= new Book("Best Self", "12350", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-6.jpg", rson);
        bestSelf.setDescription("Best Self will help you become the hero you’ve always wanted to be by teaching you how to be honest with yourself about what you desire, identify your toxic anti-self, and discover the traits of the greatest possible version of you that you can imagine.");
        Set<Author> authors6 = new HashSet<>();
        authors6.add(mikeBayer);
        bestSelf.setAuthors(authors6);
        authorRepository.save(mikeBayer);
        bookRepository.save(bestSelf);

        Author markManson = new Author("Mark Manson");
        Book theSubtleArt= new Book("The Subtle Art Of Not Giving A F*ck", "12351", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-7.jpg", rson);
        theSubtleArt.setDescription("The Subtle Art Of Not Giving A F*ck does away with the positive psychology craze to instead give you a Stoic, no bullshit approach to living a life that might not always be happy, but meaningful and centered only around what’s important to you.");
        Set<Author> authors7 = new HashSet<>();
        authors7.add(markManson);
        theSubtleArt.setAuthors(authors7);
        authorRepository.save(markManson);
        bookRepository.save(theSubtleArt);

        Author rachelHollis = new Author("Rachel Hollis");
        Book girlWash= new Book("Girl, Wash Your Face", "12352", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-8.jpg", rson);
        girlWash.setDescription("Girl, Wash Your Face inspires women to take their lives into their own hands and make their dreams happen, no matter how discouraged they may feel at the moment.");
        Set<Author> authors8 = new HashSet<>();
        authors8.add(rachelHollis);
        girlWash.setAuthors(authors8);
        authorRepository.save(rachelHollis);
        bookRepository.save(girlWash);

        Author jenSincero = new Author("Jen Sincero");
        Book youAreABadass= new Book("You Are A Badass", "12353", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-9.jpg", rson);
        youAreABadass.setDescription("You Are A Badass helps you become self-aware, figure out what you want in life and then summon the guts to not worry about the how, kick others’ opinions to the curb and focus your life on the thing that will make you happy.");
        Set<Author> authors9 = new HashSet<>();
        authors9.add(jenSincero);
        youAreABadass.setAuthors(authors9);
        authorRepository.save(jenSincero);
        bookRepository.save(youAreABadass);

        Author jordanPeterson = new Author("Jordan Peterson");
        Book rulesForLife= new Book("12 Rules For Life", "12355", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-10.jpg", rson);
        rulesForLife.setDescription("12 Rules For Life is a stern, story-based, and entertaining self-help manual for young people that lays out a set of simple principles that can help us become more disciplined, behave better, act with integrity, and balance our lives while enjoying them as much as we can.");
        Set<Author> authors10 = new HashSet<>();
        authors10.add(jordanPeterson);
        rulesForLife.setAuthors(authors10);
        authorRepository.save(jordanPeterson);
        bookRepository.save(rulesForLife);

        Author robertGreene = new Author("Robert Greene");
        Book lawsPower= new Book("The 48 Laws Of Power", "12356", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-11.jpg", rson);
        lawsPower.setDescription("The 48 Laws Of Power draws on many of history’s most famous power quarrels to show you what power looks like, how you can get it, what to do to defend yourself against the power of others and, most importantly, how to use it well and keep it.");
        Set<Author> authors11 = new HashSet<>();
        authors11.add(robertGreene);
        lawsPower.setAuthors(authors11);
        authorRepository.save(robertGreene);
        bookRepository.save(lawsPower);

        Author ichiroKishimi = new Author("Ichiro Kishimi");
        Author fumitakeKoga = new Author("Fumitake Koga");
        Book theCourage= new Book("The Courage To Be Disliked", "12357", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-12.jpg", rson);
        theCourage.setDescription("The 48 Laws Of Power draws on many of history’s most famous power quarrels to show you what power looks like, how you can get it, what to do to defend yourself against the power of others and, most importantly, how to use it well and keep it.");
        Set<Author> authors12 = new HashSet<>();
        authors12.add(ichiroKishimi);
        authors12.add(fumitakeKoga);
        theCourage.setAuthors(authors12);
        authorRepository.save(ichiroKishimi);
        authorRepository.save(fumitakeKoga);
        bookRepository.save(theCourage);

        Author viktorFrankl = new Author("Viktor Frankl");
        Book mansPower = new Book("Man’s Search For Meaning", "12357", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-13.jpg", rson);
        mansPower.setDescription("Man’s Search For Meaning details holocaust survivor Viktor Frankl’s horrifying experiences in Nazi concentration camps, along with his psychological approach of logotherapy, which is also what helped him survive and shows you how you can – and must – find meaning in your life.");
        Set<Author> authors13 = new HashSet<>();
        authors13.add(viktorFrankl);
        mansPower.setAuthors(authors13);
        authorRepository.save(viktorFrankl);
        bookRepository.save(mansPower);

        Author daleCarnegie = new Author("Dale Carnegie");
        Book howTo = new Book("How To Stop Worrying And Start Living", "12357", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-14.jpg", rson);
        howTo.setDescription("How To Stop Worrying And Start Living is a self-help classic which addresses one of the leading causes of physical illness, worry, by showing you simple and actionable techniques to eliminate it from your life.");
        Set<Author> authors14 = new HashSet<>();
        authors14.add(daleCarnegie);
        howTo.setAuthors(authors14);
        authorRepository.save(daleCarnegie);
        bookRepository.save(howTo);

        Author breneBrown = new Author("Brene Brown");
        Book daringGreatly = new Book("Daring Greatly", "12358", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-15.jpg", rson);
        daringGreatly.setDescription("Daring Greatly is a book about having the courage to be vulnerable in a world where everyone wants to appear strong, confident and like they know what they’re doing.");
        Set<Author> authors15 = new HashSet<>();
        authors15.add(breneBrown);
        daringGreatly.setAuthors(authors15);
        authorRepository.save(breneBrown);
        bookRepository.save(daringGreatly);

        Author elizabethGilbert = new Author("Elizabeth Gilbert");
        Book bigMagic = new Book("Big Magic", "12359", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-16.jpg", rson);
        bigMagic.setDescription("Big Magic is the book that’ll give you the courage you need to pursue your creative interests by showing you how to deal with your fears, notice ideas and act on them and take the stress out of creation.");
        Set<Author> authors16 = new HashSet<>();
        authors16.add(elizabethGilbert);
        bigMagic.setAuthors(authors16);
        authorRepository.save(elizabethGilbert);
        bookRepository.save(bigMagic);

        Author susanCain = new Author("Susan Cain");
        Book quiet = new Book("Quiet", "12360", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-17.jpg", rson);
        quiet.setDescription("Quiet shows the slow rise of the extrovert ideal for success throughout the 20th century, while making a case for the underappreciated power of introverts and showing up new ways for both forces to cooperate.");
        Set<Author> authors17 = new HashSet<>();
        authors17.add(susanCain);
        quiet.setAuthors(authors17);
        authorRepository.save(susanCain);
        bookRepository.save(quiet);

        Author davidJosephSchwartz = new Author("David Joseph Schwartz");
        Book theMagicOfThinkingBig = new Book("The Magic Of Thinking Big", "12361", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-18.jpg", rson);
        theMagicOfThinkingBig.setDescription("The Magic Of Thinking Big gives you several starting points to develop and strengthen the most important trait of successful people: believing in yourself.");
        Set<Author> authors18 = new HashSet<>();
        authors18.add(davidJosephSchwartz);
        theMagicOfThinkingBig.setAuthors(authors18);
        authorRepository.save(davidJosephSchwartz);
        bookRepository.save(theMagicOfThinkingBig);

        Book howToWin = new Book("How To Win Friends And Influence People", "12362", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-19.jpg", rson);
        howToWin.setDescription("How To Win Friends And Influence People teaches you countless principles to become a likable person, handle your relationships well, win others over and help them change their behavior without being intrusive.");
        Set<Author> authors19 = new HashSet<>();
        authors19.add(daleCarnegie);
        howToWin.setAuthors(authors19);
        bookRepository.save(howToWin);

        Author garyChapman = new Author("Gary Chapman");
        Book theLove = new Book("The 5 Love Languages", "12362", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-20.jpg", rson);
        theLove.setDescription("The 5 Love Languages shows couples how to make their love last by learning to recognize the unique way their partner feels love.");
        Set<Author> authors20 = new HashSet<>();
        authors20.add(garyChapman);
        theLove.setAuthors(authors20);
        authorRepository.save(garyChapman);
        bookRepository.save(theLove);

        Author calNewport = new Author("Cal Newport");
        Book deepWork = new Book("Deep Work", "12363", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-21.jpg", rson);
        deepWork.setDescription("Deep Work proposes that we have lost our ability to focus deeply and immerse ourselves in a complex task, showing you how to cultivate this skill again and focus more than ever before with four simple rules.");
        Set<Author> authors21 = new HashSet<>();
        authors21.add(calNewport);
        deepWork.setAuthors(authors21);
        authorRepository.save(calNewport);
        bookRepository.save(deepWork);

        Author davidAllen = new Author("David Allen");
        Book gettingThingsDone = new Book("Getting Things Done", "12364", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-22.jpg", rson);
        gettingThingsDone.setDescription("Deep Work proposes that we have lost our ability to focus deeply and immerse ourselves in a complex task, showing you how to cultivate this skill again and focus more than ever before with four simple rules.");
        Set<Author> authors22 = new HashSet<>();
        authors22.add(davidAllen);
        gettingThingsDone.setAuthors(authors22);
        authorRepository.save(davidAllen);
        bookRepository.save(gettingThingsDone);

        Author spencerJohnson = new Author("Spencer Johnson");
        Book whoMovedMyCheese = new Book("Who Moved My Cheese", "12365", "https://fourminutebooks.com/wp-content/uploads/2020/11/self-help-books-23.jpg", rson);
        whoMovedMyCheese.setDescription("Who Moved My Cheese tells a parable, which you can directly apply to your own life, in order to stop fearing what lies ahead and instead thrive in an environment of change and uncertainty.");
        Set<Author> authors23 = new HashSet<>();
        authors23.add(spencerJohnson);
        whoMovedMyCheese.setAuthors(authors23);
        authorRepository.save(spencerJohnson);
        bookRepository.save(whoMovedMyCheese);


        ///////////////////////////

//        Author eric = new Author("Eric", "Andre");
//        Book ddd = new Book("Domain driven design", "123456");
//        eric.getBooks().add(ddd);
//        ddd.getAuthors().add(eric);
//        HashSet<Author> authors = new HashSet<>();
//        authors.add(eric);
//        ddd.setAuthors(authors);
//        ddd.setPublisher(rson);
//        rson.getBooks().add(ddd);
//        authorRepository.save(eric);
//        bookRepository.save(ddd);
//
//        Author mark = new Author("Mark", "Manson");
//        Book subtleArt = new Book("The subtle art of not givng a fuck", "123457");
//        mark.getBooks().add(subtleArt);
//        subtleArt.getAuthors().add(mark);
//        subtleArt.setPublisher(rson);
//        rson.getBooks().add(subtleArt);
//        authorRepository.save(mark);
//        bookRepository.save(subtleArt);
//
//        Author kafka = new Author("Franz", "Kafka");
//        Book metamorphosis = new Book("Metamorphosis", "123458");
//        kafka.getBooks().add(metamorphosis);
//        metamorphosis.getAuthors().add(kafka);
//        metamorphosis.setPublisher(rson);
//        rson.getBooks().add(metamorphosis);
//        authorRepository.save(kafka);
//        bookRepository.save(metamorphosis);
//
//        Author george = new Author("George S", "Clason");
//        Book richestman = new Book("The richest man in babylon", "123459");
//        george.getBooks().add(richestman);
//        richestman.getAuthors().add(george);
//        richestman.setPublisher(rson);
//        rson.getBooks().add(richestman);
//        authorRepository.save(george);
//        bookRepository.save(richestman);

        System.out.println("Started in Bootstrap");
        System.out.println("No of Books : "+bookRepository.count());
        System.out.println("No of Authors : "+authorRepository.count());
        System.out.println("No of publication : "+publisherRepository.count());
        System.out.println("No of Books published by "+rson.getName()+" publication : "+rson.getBooks().size());

    }
}
