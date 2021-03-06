/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.cms.model.v20170301;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListAlarmHistoryRequest extends RpcAcsRequest<ListAlarmHistoryResponse> {
	
	public ListAlarmHistoryRequest() {
		super("Cms", "2017-03-01", "ListAlarmHistory", "cms");
	}

	private String callby_cms_owner;

	private String id;

	private Integer size;

	private String startTime;

	private String endTime;

	private String cursor;

	public String getcallby_cms_owner() {
		return this.callby_cms_owner;
	}

	public void setcallby_cms_owner(String callby_cms_owner) {
		this.callby_cms_owner = callby_cms_owner;
		putQueryParameter("callby_cms_owner", callby_cms_owner);
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
		putQueryParameter("Id", id);
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		putQueryParameter("Size", size);
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		putQueryParameter("StartTime", startTime);
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		putQueryParameter("EndTime", endTime);
	}

	public String getCursor() {
		return this.cursor;
	}

	public void setCursor(String cursor) {
		this.cursor = cursor;
		putQueryParameter("Cursor", cursor);
	}

	@Override
	public Class<ListAlarmHistoryResponse> getResponseClass() {
		return ListAlarmHistoryResponse.class;
	}

}
