/*
 * Scala.js (https://www.scala-js.org/)
 *
 * Copyright EPFL.
 *
 * Licensed under Apache License 2.0
 * (https://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package scala.scalajs.js.typedarray

import scala.language.implicitConversions

import java.nio._

/** Factory methods to create direct buffers from Typed Arrays.
 *
 *  All buffers created by the methods of this object are direct buffers with
 *  the native byte order of the platform.
 */
object TypedArrayBuffer {
  /** Wraps an [[ArrayBuffer]] in a direct [[java.nio.ByteBuffer ByteBuffer]]. */
  def wrap(array: ArrayBuffer): ByteBuffer =
    TypedArrayBufferBridge.wrapArrayBuffer(array)

  /** Wraps an [[ArrayBuffer]] in a direct [[java.nio.ByteBuffer ByteBuffer]]. */
  def wrap(array: ArrayBuffer, byteOffset: Int, length: Int): ByteBuffer =
    TypedArrayBufferBridge.wrapArrayBuffer(array, byteOffset, length)

  /** Wraps an [[Int8Array]] in a direct [[java.nio.ByteBuffer ByteBuffer]]. */
  def wrap(array: Int8Array): ByteBuffer =
    TypedArrayBufferBridge.wrapInt8Array(array)

  /** Wraps a [[Uint16Array]] in a direct [[java.nio.CharBuffer CharBuffer]]. */
  def wrap(array: Uint16Array): CharBuffer =
    TypedArrayBufferBridge.wrapUint16Array(array)

  /** Wraps an [[Int16Array]] in a direct [[java.nio.ShortBuffer ShortBuffer]]. */
  def wrap(array: Int16Array): ShortBuffer =
    TypedArrayBufferBridge.wrapInt16Array(array)

  /** Wraps an [[Int32Array]] in a direct [[java.nio.IntBuffer IntBuffer]]. */
  def wrap(array: Int32Array): IntBuffer =
    TypedArrayBufferBridge.wrapInt32Array(array)

  /** Wraps a [[Float32Array]] in a direct [[java.nio.FloatBuffer FloatBuffer]]. */
  def wrap(array: Float32Array): FloatBuffer =
    TypedArrayBufferBridge.wrapFloat32Array(array)

  /** Wraps a [[Float64Array]] in a direct [[java.nio.DoubleBuffer DoubleBuffer]]. */
  def wrap(array: Float64Array): DoubleBuffer =
    TypedArrayBufferBridge.wrapFloat64Array(array)
}
