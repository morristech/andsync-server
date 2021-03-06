/*
 * Copyright 2012 Tim Roes <tim.roes@inovex.de>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.inovex.andsync.util;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tim Roes <tim.roes@inovex.de>
 */
public class DBUtil {
	
	private final static DBObject emptyObject = new BasicDBObject(0);
	
	public static List<DBObject> collectionFromCursor(DBCursor cursor) {
		
		List<DBObject> objects = new ArrayList<DBObject>(cursor.count());
		while(cursor.hasNext()) {
			objects.add(cursor.next());
		}
		return objects;
		
	}
	
	public static DBObject getEmptyObject() {
		return emptyObject;
	}
	
}
