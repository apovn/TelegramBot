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
            echo.sendMessageToGroup(-1001312008375l, "Hi channel members. I'm BOT."); // Public Channel: https://web.telegram.org/#/im?p=@etalertchannel
            echo.sendMessageToGroup(-1001331863204l, "Hi channel members. I'm BOT."); // Private Channel: https://web.telegram.org/#/im?p=c1331863204_15226261375188193354
//            echo.sendMessageToUser(494637284l, "Xin chào bạn!");
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }

        System.out.println("Bot successfully started!");
    }
}
