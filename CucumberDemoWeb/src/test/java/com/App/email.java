package com.App;

import javax.mail.*;
import javax.mail.search.SubjectTerm;

import com.google.inject.spi.Message;

import java.util.Properties;

public class email {
	public String getVerificationLink(String email, String password) throws Exception {
		  Properties properties = new Properties();
	        properties.put("mail.store.protocol", "imap");
	        properties.put("mail.imap.host", "imap.gmail.com");
	        properties.put("mail.imap.port", "993");
	        properties.put("mail.imap.ssl.enable", "true");

	        Session emailSession = Session.getDefaultInstance(properties);
	        Store store = emailSession.getStore("imap");
	        store.connect("imap.gmail.com", email, password);

	        Folder emailFolder = store.getFolder("INBOX");
	        emailFolder.open(Folder.READ_ONLY);

	        Message[] messages = emailFolder.search(new SubjectTerm("Your verification link"));

	        if (messages.length > 0) {
	            Message message = messages[0];
	            String content = (String) message.getContent();
	            String link = extractLinkFromContent(content);
	            emailFolder.close(false);
	            store.close();
	            return link;
	        } else {
	            emailFolder.close(false);
	            store.close();
	            throw new Exception("No verification email found.");
	        }
	}

    private static String extractLinkFromContent(String content) {
        // Implement your link extraction logic here
        // For demonstration:
        String regex = "https?://[\\w\\.-]+(?:/[\\w\\.-]*)?";
        java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(regex);
        java.util.regex.Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            String link = matcher.group();
            if (link.contains("booking.com")) {
                return link;
            }
        }
        return null;
    }

	
}
