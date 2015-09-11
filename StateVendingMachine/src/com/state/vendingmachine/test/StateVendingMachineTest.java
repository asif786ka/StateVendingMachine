package com.state.vendingmachine.test;

import com.state.vendingmachine.VendingMachine;
import com.state.vendingmachine.exception.VendingMachineWarning;

public class StateVendingMachineTest {
	public StateVendingMachineTest() {
	}

	public static void main(String[] args) {
		
		VendingMachine machine = new VendingMachine();
		machine.reFill(2); //
		// First despense
		try {
			machine.insertCoin();
			machine.pressButton();
		} catch (VendingMachineWarning e) {
			System.out.println("Test 1:" + e.getMessage());
		}
		// Second Test
		try {
			machine.insertCoin();
			machine.insertCoin();
			machine.pressButton();
		} catch (VendingMachineWarning e) {
			System.out.println("Test 2:" + e.getMessage());
			try {
				machine.pressButton();
			} catch (VendingMachineWarning f) {
				// TODO
			}
		}
		// Test THree
		try {
			machine.pressButton();
		} catch (VendingMachineWarning e) {
			System.out.println("Test 3:" + e.getMessage());
		}
		// Test Four
		try {
			machine.insertCoin();
		} catch (VendingMachineWarning e) {
			System.out.println("Test 4:" + e.getMessage());
		}
	}
}