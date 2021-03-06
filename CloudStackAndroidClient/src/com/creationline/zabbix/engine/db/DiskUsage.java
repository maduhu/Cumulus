/*******************************************************************************
 * Copyright 2011-2012 Creationline,Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.creationline.zabbix.engine.db;

import android.net.Uri;
import android.provider.BaseColumns;

import com.creationline.zabbix.engine.ZbxRestContentProvider;

public class DiskUsage implements BaseColumns {
	//This table contains plot values for zabbix graphs of resources
	
	//table columns other than _ID (_ID already included in BaseColumns declaration)
	//value of var must match name of var exactly, except just lower-case.
	public static final String HOST = "host";
	public static final String ITEMNAME = "itemname";
	public static final String CLOCK = "clock";
	public static final String VALUE = "value";
	
	
	public static final class META_DATA {
		public static final String TABLE_NAME = "diskusage";
		public static final Uri CONTENT_URI = Uri.parse("content://"+ZbxRestContentProvider.AUTHORITY+"/"+TABLE_NAME);
	}
	
}
