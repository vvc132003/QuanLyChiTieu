package org.nhom7.quanlychitieu.ui.add;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddViewModel extends ViewModel {

    // MutableLiveData to hold data related to the AddFragment
    private final MutableLiveData<String> userInput;

    // Constructor for the ViewModel
    public AddViewModel() {
        // Initialize the MutableLiveData
        userInput = new MutableLiveData<>();

        // Set an initial value if needed
        userInput.setValue("");
    }

    // Method to get the LiveData object for observing user input changes
    public LiveData<String> getUserInput() {
        return userInput;
    }

    // Method to update user input in the ViewModel
    public void setUserInput(String input) {
        userInput.setValue(input);
    }

    // Method for handling data submission or any other AddFragment-specific logic
    public void submitData() {
        // Implement logic for handling the submitted data
        // For example, you might validate the input and save it to a database
    }
}
