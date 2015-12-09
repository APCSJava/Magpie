package org.asl.collins.magpie.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class MagpieWeb implements EntryPoint {

	public void onModuleLoad() {
		final Magpie maggie = new Magpie();
		

		final TextBox inputText = new TextBox();
		inputText.setText("Type here to chat...");
		inputText.setVisibleLength(60);
		final Button sendButton = new Button("Send");
		final Label magpieResponse = new Label();
		magpieResponse.setText(maggie.getGreeting());

		// Add user interface elements to the RootPanel
		RootPanel.get("magpieResponseContainer").add(magpieResponse);
		RootPanel.get("userInputContainer").add(inputText);
		RootPanel.get("sendButtonContainer").add(sendButton);

		// Focus the cursor on the name field when the app loads
		inputText.setFocus(true);
		inputText.selectAll();

		// Create a handler for the sendButton and nameField
		class MyHandler implements ClickHandler, KeyUpHandler {
			/**
			 * Fired when the user clicks on the sendButton.
			 */
			public void onClick(ClickEvent event) {
				getMagpieResponse();
			}

			/**
			 * Fired when the user types in the nameField.
			 */
			public void onKeyUp(KeyUpEvent event) {
				if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
					getMagpieResponse();
				}
			}

			/**
			 * Send the text to the server and wait for a response.
			 */
			private void getMagpieResponse() {
				magpieResponse.setText(maggie.getResponse(inputText.getText()));
				inputText.setText("");
				inputText.setFocus(true);
				inputText.selectAll();
			}
		}

		// Add a handler to send the name to the server
		MyHandler handler = new MyHandler();
		sendButton.addClickHandler(handler);
		inputText.addKeyUpHandler(handler);
	}
}
