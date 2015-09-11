package com.state.vendingmachine.vendingstates;

import com.state.vendingmachine.VendingMachine;
import com.state.vendingmachine.exception.VendingMachineWarning;
import com.state.vendingmachine.vendinginterface.VendingState;

public class EmptyState implements VendingState {
	
	VendingMachine machine;

	public EmptyState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws VendingMachineWarning {
		throw new VendingMachineWarning("Can not process the request");
	}

	@Override
	public void pressButton() throws VendingMachineWarning {
		throw new VendingMachineWarning("Invalid Action");
	}

	@Override
	public void dispense() throws VendingMachineWarning {
		throw new VendingMachineWarning("Invalid Action");
	}
}
