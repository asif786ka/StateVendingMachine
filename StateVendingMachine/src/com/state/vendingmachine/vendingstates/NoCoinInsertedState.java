package com.state.vendingmachine.vendingstates;

import com.state.vendingmachine.VendingMachine;
import com.state.vendingmachine.exception.VendingMachineWarning;
import com.state.vendingmachine.vendinginterface.VendingState;

public class NoCoinInsertedState implements VendingState {
	
	VendingMachine machine;

	public NoCoinInsertedState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws VendingMachineWarning {
		if (!machine.isEmpty()) {
			machine.setMachineState(machine.getConinInsertedState());
		} else {
			throw new VendingMachineWarning(
					"Can not process request .. Machine is out of stock");
		}
	}

	@Override
	public void pressButton() throws VendingMachineWarning {
		throw new VendingMachineWarning("No coin inserted ..");
	}

	@Override
	public void dispense() throws VendingMachineWarning {
		throw new VendingMachineWarning("Invalid Operation");
	}
}
