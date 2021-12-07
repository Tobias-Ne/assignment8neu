package com.example.assignment8neu;

public interface Plugin {
    String getApplicationTitle();
    String getButtonText();
    String getInitialText();
    void buttonClicked();
    void setApplication(InputProvider app);

}
