/**
 * Created by tri.tran on 1/3/2018.
 */
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;


public class Main {
    public static void main(String[] args) {
        // Initialize Api Context
        ApiContextInitializer.init();

        // Instantiate Telegram Bots API
        TelegramBotsApi botsApi = new TelegramBotsApi();

        // Register our bot
        try {
            EchoBot echo = new EchoBot();
            botsApi.registerBot(echo);
//            echo.sendMessageToGroup(-297605950l, "Hi, I'm ET_BOT.");  // Group            
//            echo.sendMessageToUser(494637284l, "Xin chào bạn!");  // user' chat_id
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        System.out.println("Bot successfully started!");
    }
}
