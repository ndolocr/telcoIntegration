# Architecture Decisions

---

## ADR-001

### Title

Unified Payment Endpoint

### Status

Accepted

### Decision

Expose a single endpoint for STK Push.

POST /payments/stkpush

### Rationale

Client systems should not know provider-specific implementations.

The middleware is responsible for routing requests to the appropriate provider.

### Consequences

- Simpler client integrations.
- Easier addition of new providers.
- Better abstraction.