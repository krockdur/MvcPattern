package com.jf72.job;

import java.text.DateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import com.jf72.model.Data;
import com.jf72.ui.MainFrame;

public class Job extends TimerTask {

	Data data;
	MainFrame mainFrame;
	Timer timer;
	
	public Job(MainFrame mainFrame, Data data) {
		
		
		this.mainFrame = mainFrame;
		this.data = data;
	}
	
	public void initController() {
		this.mainFrame.getBtnTest().addActionListener(e->btnTestClick());
		this.mainFrame.getBtnDisconnect().addActionListener(e->btnDisconnectClick());
		this.mainFrame.getTxtAreaDebug().setText("Initialisation");
	}
	
	/**
	 * Launch Timer
	 */
	private void connection() {	
		
		timer = new Timer();
		timer.purge();
		timer.schedule(this, 1000, 1000);
	}
	
	private void disconnection() {
		timer.cancel();
	}

	@Override
	public void run() {
		Date aujourdhui = new Date();
	    DateFormat mediumDateFormat = DateFormat.getDateTimeInstance(
	            DateFormat.MEDIUM,
	            DateFormat.MEDIUM);
		
	    // update model
		this.data.setDate(mediumDateFormat.format(aujourdhui));
		
		// update view
		this.mainFrame.getTxtAreaDebug().append(this.data.getDate() + "\r\n");
	}
	
	
	private void btnTestClick() {
		connection();
	}
	
	private void btnDisconnectClick() {
		disconnection();
	}
	
}
