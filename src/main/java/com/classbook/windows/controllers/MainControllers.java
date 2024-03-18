package com.classbook.windows.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // Logique de connexion ici

        // Exemple de sortie
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);

        // Redirection vers une autre page après la connexion
        // Par exemple, si l'authentification réussit, vous pouvez charger index.fxml
        // Vous pouvez ajouter cette logique ici en utilisant FXMLLoader
        // Par exemple:
        /*
        try {
            Parent root = FXMLLoader.load(getClass().getResource("index.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        */
    }
}
