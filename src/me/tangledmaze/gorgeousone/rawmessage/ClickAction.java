package me.tangledmaze.gorgeousone.rawmessage;

public enum ClickAction {
	
	RUN("run_command"),
	SUGGEST("suggest_command"),
	URL("open_url");
		
	private String action;
	
	private ClickAction(String action) {
		this.action = action;
	}
	
	@Override
	public String toString() {
		return action;
	}
}