/**
 * Copyright 2016 the Rex-Soft Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rex.db.exception;

/**
 * DB Runtime Exception.
 * 
 * @version 1.0, 2016-01-27
 * @since Rexdb-1.0
 */
public class DBRuntimeException extends RuntimeException {
	
	public DBRuntimeException(Throwable e){
		super(e);
	}
	
	public DBRuntimeException(String code) {
		super(ExceptionResourceFactory.getInstance().translate(code));
	}
	
	public DBRuntimeException(String code, Object... params) {
		super(ExceptionResourceFactory.getInstance().translate(code, params));
	}

	public DBRuntimeException(String code, Throwable e, Object... params) {
		super(ExceptionResourceFactory.getInstance().translate(code, params), e);
	}

}