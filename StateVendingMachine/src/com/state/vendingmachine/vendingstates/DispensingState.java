package com.state.vendingmachine.vendingstates;

import com.state.vendingmachine.VendingMachine;
import com.state.vendingmachine.exception.VendingMachineWarning;
import com.state.vendingmachine.vendinginterface.VendingState;

public class DispensingState implements VendingState {
	
	VendingMachine machine;

	public DispensingState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws VendingMachineWarning {
		throw new VendingMachineWarning("wait ... previous order is processing");
	}

	@Override
	public void pressButton() throws VendingMachineWarning {
		throw new VendingMachineWarning("wait ... previous order is processing");
	}

	@Override
	public void dispense() throws VendingMachineWarning {
		machine.setMachineState(machine.getNoCoinInsertedState());
	}
}