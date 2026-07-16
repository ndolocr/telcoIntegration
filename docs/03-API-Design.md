# API Design

## Design Philosophy

The platform exposes unified APIs.

Clients should never communicate directly with provider-specific endpoints.

Example

POST /payments/stkpush

instead of

POST /daraja/stkpush

POST /airtel/stkpush

The middleware decides which provider should process the request.