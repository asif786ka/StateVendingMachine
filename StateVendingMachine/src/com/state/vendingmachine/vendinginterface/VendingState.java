package com.state.vendingmachine.vendinginterface;

import com.state.vendingmachine.exception.VendingMachineWarning;

/**
 * @author Asif
 * This class contains the necessary methods in the Vending machine.
 */
public interface VendingState {
	   
    public void insertCoin()throws VendingMachineWarning;
    public void pressButton()throws VendingMachineWarning;
    public void dispense()throws VendingMachineWarning;
}