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
package com.aliyuncs.rds.model.v20140815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.rds.transform.v20140815.DescribeImportsForSQLServerResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeImportsForSQLServerResponse extends AcsResponse {

	private String requestId;

	private Integer totalRecordCounts;

	private Integer pageNumber;

	private Integer sQLItemsCounts;

	private List<SQLServerImport> items;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalRecordCounts() {
		return this.totalRecordCounts;
	}

	public void setTotalRecordCounts(Integer totalRecordCounts) {
		this.totalRecordCounts = totalRecordCounts;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getSQLItemsCounts() {
		return this.sQLItemsCounts;
	}

	public void setSQLItemsCounts(Integer sQLItemsCounts) {
		this.sQLItemsCounts = sQLItemsCounts;
	}

	public List<SQLServerImport> getItems() {
		return this.items;
	}

	public void setItems(List<SQLServerImport> items) {
		this.items = items;
	}

	public static class SQLServerImport {

		private Integer importId;

		private String fileName;

		private String dBName;

		private ImportStatus importStatus;

		private String startTime;

		public Integer getImportId() {
			return this.importId;
		}

		public void setImportId(Integer importId) {
			this.importId = importId;
		}

		public String getFileName() {
			return this.fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public String getDBName() {
			return this.dBName;
		}

		public void setDBName(String dBName) {
			this.dBName = dBName;
		}

		public ImportStatus getImportStatus() {
			return this.importStatus;
		}

		public void setImportStatus(ImportStatus importStatus) {
			this.importStatus = importStatus;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

public enum ImportStatus {

			CANCELLING("Cancelling"),
			FAILED("Failed"),
			CANCELLED("Cancelled"),
			SUCCESS("Success"),
			IMPORTING("Importing"),
			PENDING("Pending"),;
	
    private String stringValue;

	ImportStatus(String stringValue) {
        setStringValue(stringValue);
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }
    
    public static ImportStatus getEnum(String stringValue){
    	if(null == stringValue){
    		return null;
    	}
    	
    	for (ImportStatus importStatus : ImportStatus.values()) {
			if(importStatus.getStringValue().equals(stringValue)){
				return importStatus;
			}
		}
    	return null;
    }
}
	}

	@Override
	public DescribeImportsForSQLServerResponse getInstance(UnmarshallerContext context) {
		return	DescribeImportsForSQLServerResponseUnmarshaller.unmarshall(this, context);
	}
}
