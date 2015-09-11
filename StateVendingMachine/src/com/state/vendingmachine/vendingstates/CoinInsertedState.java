package com.state.vendingmachine.vendingstates;

import com.state.vendingmachine.VendingMachine;
import com.state.vendingmachine.exception.VendingMachineWarning;
import com.state.vendingmachine.vendinginterface.VendingState;

public class CoinInsertedState implements VendingState {
	
	VendingMachine machine = null;

	public CoinInsertedState(VendingMachine machine) {
		this.machine = machine;
	}

	@Override
	public void insertCoin() throws VendingMachineWarning {
		throw new VendingMachineWarning("Coin is already inserted.");
	}

	@Override
	public void dispense() throws VendingMachineWarning {
		throw new VendingMachineWarning("Dispense button is not pressed.");

	}

	@Override
	public void pressButton() throws VendingMachineWarning {
		machine.setMachineState(machine.getDispensingState());
	}
}