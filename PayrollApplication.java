package com.payroll;

import com.formdev.flatlaf.FlatLightLaf;
import com.payroll.ui.MainFrame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class PayrollApplication {

    public static void main(String[] args) {
        // Set the Look and Feel to FlatLaf
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        
        // Launch Spring Boot in a way that doesn't block the Swing EDT
        SpringApplicationBuilder builder = new SpringApplicationBuilder(PayrollApplication.class);
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);
        
        // Schedule the Swing UI startup on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = context.getBean(MainFrame.class);
            mainFrame.setVisible(true);
        });
    }
} 
