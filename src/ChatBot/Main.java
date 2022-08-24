package ChatBot;

public class Main {

    public static void main(String[] args) {
        Bot bot = new Bot("Mo Salah", 1992);
        bot.greeting();
        bot.remindName();
        bot.guessAge();
        bot.count();
        bot.test();
        bot.end();
    }
}
