package com.state.vendingmachine;

import com.state.vendingmachine.exception.VendingMachineWarning;
import com.state.vendingmachine.vendinginterface.VendingState;
import com.state.vendingmachine.vendingstates.CoinInsertedState;
import com.state.vendingmachine.vendingstates.DispensingState;
import com.state.vendingmachine.vendingstates.EmptyState;
import com.state.vendingmachine.vendingstates.NoCoinInsertedState;

public class VendingMachine {
	
	VendingState coninInsertedState = new CoinInsertedState(this);
	VendingState emptyState = new EmptyState(this);
	VendingState noCoinInsertedState = new NoCoinInsertedState(this);
	VendingState dispensingState = new DispensingState(this);
	VendingState machineState = null;
	int capacity = 0;

	public VendingMachine() {
		machineState = noCoinInsertedState;
	}

	public void reFill(int count) {
		capacity += count;
		machineState = noCoinInsertedState;
	}

	/**
	 * Two Actions performed by Machine
	 */
	public void insertCoin() throws VendingMachineWarning {
		machineState.insertCoin();
	}

	public void pressButton() throws VendingMachineWarning {
		machineState.pressButton();
		machineState.dispense();
		capacity--;
	}

	public boolean isEmpty() {
		if (capacity <= 0)
			return true;
		else
			return false;
	}

	public void setMachineState(VendingState machineState) {
		this.machineState = machineState;
	}

	public VendingState getMachineState() {
		return machineState;
	}

	public void setConinInsertedState(VendingState coninInsertedState) {
		this.coninInsertedState = coninInsertedState;
	}

	public VendingState getConinInsertedState() {
		return coninInsertedState;
	}

	public void setEmptyState(VendingState emptyState) {
		this.emptyState = emptyState;
	}

	public VendingState getEmptyState() {
		return emptyState;
	}

	public void setNoCoinInsertedState(VendingState noCoinInsertedState) {
		this.noCoinInsertedState = noCoinInsertedState;
	}

	public VendingState getNoCoinInsertedState() {
		return noCoinInsertedState;
	}

	public void setDispensingState(VendingState dispensingState) {
		this.dispensingState = dispensingState;
	}

	public VendingState getDispensingState() {
		return dispensingState;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getCapacity() {
		return capacity;
	}
}