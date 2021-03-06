package com.bean;

import java.math.BigDecimal;

public class Case_Channel {
	private int channel_id;
	private String channel_name;
	private int video_carrier_frequency;
	private int audio_carrier_frequency;
	private String channel_charge_type;
	private String channel_transmission;
	private BigDecimal channel_charge;
	public Case_Channel(int channel_id, String channel_name, int video_carrier_frequency, int audio_carrier_frequency,
			String channel_charge_type, String channel_transmission, BigDecimal channel_charge) {
		super();
		this.channel_id = channel_id;
		this.channel_name = channel_name;
		this.video_carrier_frequency = video_carrier_frequency;
		this.audio_carrier_frequency = audio_carrier_frequency;
		this.channel_charge_type = channel_charge_type;
		this.channel_transmission = channel_transmission;
		this.channel_charge = channel_charge;
	}
	public int getChannel_id() {
		return channel_id;
	}
	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}
	public String getChannel_name() {
		return channel_name;
	}
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}
	public int getVideo_carrier_frequency() {
		return video_carrier_frequency;
	}
	public void setVideo_carrier_frequency(int video_carrier_frequency) {
		this.video_carrier_frequency = video_carrier_frequency;
	}
	public int getAudio_carrier_frequency() {
		return audio_carrier_frequency;
	}
	public void setAudio_carrier_frequency(int audio_carrier_frequency) {
		this.audio_carrier_frequency = audio_carrier_frequency;
	}
	public String getChannel_charge_type() {
		return channel_charge_type;
	}
	public void setChannel_charge_type(String channel_charge_type) {
		this.channel_charge_type = channel_charge_type;
	}
	public String getChannel_transmission() {
		return channel_transmission;
	}
	public void setChannel_transmission(String channel_transmission) {
		this.channel_transmission = channel_transmission;
	}
	public BigDecimal getChannel_charge() {
		return channel_charge;
	}
	public void setChannel_charge(BigDecimal channel_charge) {
		this.channel_charge = channel_charge;
	}
	
}
